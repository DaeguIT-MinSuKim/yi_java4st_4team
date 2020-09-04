package yi_java4st_4team.menuTable.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import yi_java4st_4team.conn.JdbcUtil;
import yi_java4st_4team.menuTable.dao.MenuOrderDao;
import yi_java4st_4team.menuTable.dto.Menu;
import yi_java4st_4team.menuTable.dto.MenuOrder;
import yi_java4st_4team.menuTable.dto.TableInfo;

public class MenuOrderDaoImpl implements MenuOrderDao {
	private static final MenuOrderDaoImpl instance = new MenuOrderDaoImpl();

	private MenuOrderDaoImpl() {
	}

	public static MenuOrderDaoImpl getInstance() {
		return instance;
	}

	@Override
	public List<MenuOrder> selectMenuOrderByAll() {
		String sql = "SELECT o.NO NO, o.CODE CODE, ORDERDAY, CNT, ISPAYMENT, m.NAME MNANE, PRICE, t.NAME TNAME FROM MENU_ORDER o JOIN MENU m ON o.CODE = m.CODE JOIN TABLEINFO t ON o.NO = t.NO";
		try (Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			if (rs.next()) {
				List<MenuOrder> list = new ArrayList<MenuOrder>();
				do {
					list.add(getMenuOrder(rs));
				} while (rs.next());
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private MenuOrder getMenuOrder(ResultSet rs) throws SQLException {
		TableInfo tableInfo = new TableInfo(rs.getInt("NO"), rs.getString("TNAME"));
		System.out.println(tableInfo.getName() + " " + tableInfo.getNo());
		Menu menu = new Menu(rs.getString("CODE"), rs.getString("MNANE"), rs.getInt("PRICE"));
		System.out.println(menu.getCode() + " " + menu.getName() + " " + menu.getPrice());
		Date orderDay = rs.getTimestamp("ORDERDAY");
		int cnt = rs.getInt("CNT");
		int isPayment = rs.getInt("ISPAYMENT");
		return new MenuOrder(tableInfo, menu, orderDay, cnt, isPayment);
	}

	@Override
	public int insertMeunOrder(MenuOrder mo) {
		String sql = "INSERT INTO MENU_ORDER VALUES(?, ?, ?, ?, ?)";
		try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, mo.getTableInfo().getNo());
			pstmt.setString(2, mo.getMenu().getCode());
			pstmt.setTimestamp(3, new Timestamp(mo.getOrderday().getTime()));
			pstmt.setInt(4, mo.getCnt());
			pstmt.setInt(5, mo.getIsPayment());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteMenuOrder(MenuOrder mo) {
		String sql = "DELETE FROM MENU_ORDER WHERE NO = ?";
		try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, mo.getTableInfo().getNo());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int updateMenuOrder(MenuOrder mo) {
		String sql = "UPDATE MENU_ORDER SET CODE=?, ORDERDAY=?, CNT=?, ISPAYMENT=? WHERE NO =?";
		try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, mo.getMenu().getCode());
			pstmt.setTimestamp(2, new Timestamp(mo.getOrderday().getTime()));
			pstmt.setInt(3, mo.getCnt());
			pstmt.setInt(4, mo.getIsPayment());
			pstmt.setInt(5, mo.getTableInfo().getNo());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<MenuOrder> selectOrderByTableNo(TableInfo tInfo) {
		String sql = "SELECT o.NO AS NO, o.CODE AS CODE, ORDERDAY, CNT, ISPAYMENT, m.NAME AS MNANE, PRICE, t.NAME AS TNAME FROM MENU_ORDER o JOIN MENU m ON o.CODE = m.CODE JOIN TABLEINFO t ON o.NO = t.NO WHERE o.NO = ? AND ISPAYMENT = 0";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, tInfo.getNo());
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					List<MenuOrder> list = new ArrayList<MenuOrder>();
					do {
						list.add(getMenuOrder(rs));
					} while (rs.next());
					return list;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public List<MenuOrder> selectSellAllByAll() {
		String sql = "SELECT ROW_NUMBER() OVER (ORDER BY SUM(CNT) * PRICE DESC) AS RANK,"
				+ " SUM(CNT) AS HISAL, NAME, SUM(CNT) * PRICE AS SUMPRICE, ROUND(100 * (SUM(CNT) * PRICE)/(SELECT SUM(PRICE * CNT) AS SUMALL"
				+ " FROM MENU M LEFT OUTER JOIN MENU_ORDER O ON M.CODE = O.CODE), 2) AS PERCENTAGE"
				+ " FROM MENU_ORDER O LEFT OUTER JOIN MENU M ON O.CODE = M.CODE GROUP BY NAME, PRICE";
		try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					List<MenuOrder> list = new ArrayList<MenuOrder>();
					do {
						list.add(getMenuOrderPer(rs));
					} while (rs.next());
					return list;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private MenuOrder getMenuOrderPer(ResultSet rs) throws SQLException {
		Menu menu = new Menu(rs.getString("CODE"), rs.getString("NANE"), rs.getInt("PRICE"));
		Date orderDay = rs.getTimestamp("ORDERDAY");
		int cnt = rs.getInt("CNT");
		int isPayment = rs.getInt("ISPAYMENT");
		return new MenuOrder(menu, orderDay, cnt, isPayment);
	}

//		 List가 아니라 MenuOrder 하나만 리턴.
//	@Override
//	public MenuOrder selectByOrderNo(MenuOrder mo) {
//		String sql = "SELECT * " + "FROM MENU_ORDER WHERE NO = ?";
//		try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
//			pstmt.setInt(1, mo.getTno().getNo());
//			try (ResultSet rs = pstmt.executeQuery()) {
//				if (rs.next()) {
//					return getMenuOrder(rs);
//				}
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return null;
//	}

}

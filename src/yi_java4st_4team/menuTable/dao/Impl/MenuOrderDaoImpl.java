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
		String sql = "SELECT T.NO, M.NAME, M.PRICE * O.CNT AS PRICE, O.CNT, O.ISPAYMENT FROM MENU M JOIN MENU_ORDER O ON (M.CODE = O.CODE) JOIN TABLEINFO T ON (T.NO = O.NO)";
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
//		Menu menu = new Menu();
//		MenuOrder mOrder = new MenuOrder();
//		TableInfo tInfo = new TableInfo();
//		
//		mOrder.setTno(tInfo);
//		mOrder.setmCode(menu);
//		mOrder.
//		
//		return mOrder;
		TableInfo tno = new TableInfo(rs.getInt("NO"));
		Menu mName = new Menu(rs.getString("NAME"));
		int price = rs.getInt("PRICE");
		int cnt = rs.getInt("CNT");
		int isPayment = rs.getInt("ISPAYMENT");
		return new MenuOrder(tno, mName, price, cnt, isPayment);
	}

	@Override
	public int insertMeunOrder(MenuOrder mo) {
		String sql = "INSERT INTO MENU_ORDER VALUES(?, ?, ?, ?, ?)";
		try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, mo.getTno().getNo());
			pstmt.setString(2, mo.getmName().getName());
			pstmt.setInt(3, mo.getPrice());
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
			pstmt.setInt(1, mo.getTno().getNo());
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
			pstmt.setString(1, mo.getmCode().getName());
			pstmt.setTimestamp(2, new Timestamp(mo.getOrderday().getTime()));
			pstmt.setInt(3, mo.getCnt());
			pstmt.setInt(4, mo.getIsPayment());
			pstmt.setInt(5, mo.getTno().getNo());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public MenuOrder selectByOrderNo(MenuOrder mo) {
		String sql = "SELECT * " + "FROM MENU_ORDER WHERE NO = ?";
		try (Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, mo.getTno().getNo());
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					return getMenuOrder(rs);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}

package yi_java4st_4team.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import yi_java4st_4team.conn.JdbcUtil;
import yi_java4st_4team.dao.MenuOrderDao;
import yi_java4st_4team.dto.MenuOrder;

public class MenuOrderDaoImpl implements MenuOrderDao {
	private static final MenuOrderDaoImpl instance = new MenuOrderDaoImpl();
	
	private  MenuOrderDaoImpl() {}
	
	public static MenuOrderDaoImpl getInstance() {
		return instance;
	}



	@Override
	public List<MenuOrder> selectMenuOrderByAll() {
		String sql = "SELECT NO, CODE, ORDERDAY, CNT, ISPAYMENT FROM MENU_ORDER";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()){
			if(rs.next()) {
				List<MenuOrder> list = new ArrayList<MenuOrder>();
				do {
					list.add(getMenuOrder(rs));
				}while(rs.next());
				return list;
			}
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return null;
	}

	
	  private MenuOrder getMenuOrder(ResultSet rs) throws SQLException { int no =
	  rs.getInt("No"); String code = rs.getString("CODE"); Date orderday =
	  rs.getTimestamp("ORDERDAY"); int cnt = rs.getInt("CNT"); int isPayment =
	  rs.getInt("ISPAYMENT"); return new MenuOrder(no, code, orderday, cnt,
	  isPayment); }
	  
		/*
		 * @Override public int insertMeunOrder(MenuOrder mo) { String sql =
		 * "INSERT INTO MENU_ORDER VALUES(?, ?, ?, ?, ?)"; try(Connection con =
		 * JdbcUtil.getConnection(); PreparedStatement pstmt =
		 * con.prepareStatement(sql)){ pstmt.setInt(1, mo.getNo()); pstmt.setString(2,
		 * mo.getCode()); pstmt.setTimestamp(3, new
		 * Timestamp(mo.getOrderday().getTime())); pstmt.setInt(4, mo.getCnt());
		 * pstmt.setInt(5, mo.getIsPayment()); return pstmt.executeUpdate(); } catch
		 * (SQLException e) { e.printStackTrace(); } return 0; }
		 * 
		 * @Override public int deleteMenuOrder(MenuOrder mo) { String sql =
		 * "DELETE FROM MENU_ORDER WHERE NO = ?"; try(Connection con =
		 * JdbcUtil.getConnection(); PreparedStatement pstmt =
		 * con.prepareStatement(sql)){ pstmt.setInt(1, mo.getNo()); return
		 * pstmt.executeUpdate(); } catch (SQLException e) { e.printStackTrace(); }
		 * return 0; }
		 * 
		 * 
		 * @Override public int updateMenuOrder(MenuOrder mo) { String sql =
		 * "UPDATE MENU_ORDER SET CODE=?, ORDERDAY=?, CNT=?, ISPAYMENT=? WHERE NO =?";
		 * try(Connection con = JdbcUtil.getConnection(); PreparedStatement pstmt =
		 * con.prepareStatement(sql)){ pstmt.setString(1, mo.getCode());
		 * pstmt.setTimestamp(2, new Timestamp(mo.getOrderday().getTime()));
		 * pstmt.setInt(3, mo.getCnt()); pstmt.setInt(4, mo.getIsPayment());
		 * pstmt.setInt(5, mo.getNo()); } catch (SQLException e) { e.printStackTrace();
		 * } return 0; }
		 */

	@Override
	public MenuOrder selectByOrderNo(MenuOrder mo) {
		String sql = "SELECT * " + 
				"FROM MENU_ORDER WHERE NO = ?"; 
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, mo.getNo());
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) {
					return getMenuOrder(rs);
				}
			}			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return null;
	}

}

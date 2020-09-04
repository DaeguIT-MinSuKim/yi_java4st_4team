package yi_java4st_4team.menuTable.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import yi_java4st_4team.conn.JdbcUtil;
import yi_java4st_4team.menuTable.dao.TableInfoDao;
import yi_java4st_4team.menuTable.dto.Menu;
import yi_java4st_4team.menuTable.dto.TableInfo;

public class TableInfoDaoImpl implements TableInfoDao {
	private static final TableInfoDaoImpl instance = new TableInfoDaoImpl();
		
	public TableInfoDaoImpl() {}
	
	public static TableInfoDaoImpl getInstance() {
		return instance;
	}

	@Override
	public List<TableInfo> selectTableInfoByAll() {
		String sql = "SELECT NO, NAME FROM TABLEINFO ORDER BY NO";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){
			if(rs.next()) {
				List<TableInfo> list = new ArrayList<TableInfo>();
				do {
					list.add(getTableInfo(rs));
				}while (rs.next());
				return list;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return null;
	}

	private TableInfo getTableInfo(ResultSet rs) throws SQLException {
		int no = rs.getInt("NO");
		String name = rs.getString("NAME");
		return new TableInfo(no, name);
	}

	@Override
	public int intsertTableInfo(TableInfo ti) {
		String sql = "INSERT INTO TABLEINFO VALUES(?, ?)";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, ti.getNo());
			pstmt.setString(2, ti.getName());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public int updateTableInfo(TableInfo ti) {
		String sql = "UPDATE TABLEINFO SET NAME = ? WHERE NO = ?";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setString(1, ti.getName());
			pstmt.setInt(2, ti.getNo());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);			
		}
	}

	@Override
	public int deleteTableInfo(TableInfo ti) {
		String sql = "DELETE FROM TABLEINFO WHERE NO = ?";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, ti.getNo());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}		
	}

	@Override
	public TableInfo selectTableInfoDaoByTableNo(TableInfo ti) {
		String sql = "SELECT NO, NAME FROM TABLEINFO WHERE NO = ?";
		try(Connection con = JdbcUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setInt(1, ti.getNo());
			try(ResultSet rs =pstmt.executeQuery()){
				if(rs.next()) {
					return getTableInfo(rs);
				}
			}
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return null;
	}
}

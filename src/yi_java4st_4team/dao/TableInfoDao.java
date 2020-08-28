package yi_java4st_4team.dao;

import java.util.List;

import yi_java4st_4team.dto.TableInfo;


public interface TableInfoDao {
	List<TableInfo> selectTableInfoByAll();

	int intsertTableInfo(TableInfo ti);
	
	int updateTableInfo(TableInfo ti);
	
	int deleteTableInfo(TableInfo ti);
	
	TableInfo selectTableInfoDaoByTableNo(TableInfo ti);
	

}

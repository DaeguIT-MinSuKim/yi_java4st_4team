package yi_java4st_4team.menuTable.dao.Impl.service;

import java.util.List;

import yi_java4st_4team.menuTable.dao.TableInfoDao;
import yi_java4st_4team.menuTable.dao.Impl.TableInfoDaoImpl;
import yi_java4st_4team.menuTable.dto.TableInfo;

public class TableInfoService {
	TableInfoDao dao = TableInfoDaoImpl.getInstance();
	
	public List<TableInfo> selectTableInfoAll() {
		return dao.selectTableInfoByAll();
	}
}

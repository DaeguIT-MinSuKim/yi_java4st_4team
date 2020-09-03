package yi_java4st_4team.menuTable.dao;

import java.util.List;

import yi_java4st_4team.menuTable.dto.MenuOrder;
import yi_java4st_4team.menuTable.dto.TableInfo;

public interface MenuOrderDao {
	List<MenuOrder> selectMenuOrderByAll();	
	
	  int insertMeunOrder(MenuOrder mo);
	  
	  int deleteMenuOrder(MenuOrder mo);
	  
	  int updateMenuOrder(MenuOrder mo);	 
	
	List<MenuOrder> selectOrderByTableNo(TableInfo tInfo);

}

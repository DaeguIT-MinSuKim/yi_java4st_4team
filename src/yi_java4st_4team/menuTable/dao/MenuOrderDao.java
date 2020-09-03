package yi_java4st_4team.menuTable.dao;

import java.util.List;

import yi_java4st_4team.menuTable.dto.MenuOrder;

public interface MenuOrderDao {
	List<MenuOrder> selectMenuOrderByAll();	
	
	  int insertMeunOrder(MenuOrder mo);
	  
	  int deleteMenuOrder(MenuOrder mo);
	  
	  int updateMenuOrder(MenuOrder mo);	 
	
	MenuOrder selectByOrderNo(MenuOrder mo);

	List<MenuOrder> selectByOrderNo();
	
}

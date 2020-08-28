package yi_java4st_4team.dao;

import java.util.List;

import yi_java4st_4team.dto.MenuOrder;

public interface MenuOrderDao {
	List<MenuOrder> selectMenuOrderByAll();
	
	/*
	 * int insertMeunOrder(MenuOrder mo);
	 * 
	 * int deleteMenuOrder(MenuOrder mo);
	 * 
	 * int updateMenuOrder(MenuOrder mo);
	 */
	
	MenuOrder selectByOrderNo(MenuOrder mo);
	
}

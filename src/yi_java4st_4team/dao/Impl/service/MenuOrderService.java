package yi_java4st_4team.dao.Impl.service;

import java.util.List;

import yi_java4st_4team.dao.MenuDao;
import yi_java4st_4team.dao.MenuOrderDao;
import yi_java4st_4team.dao.Impl.MenuDaoImpl;
import yi_java4st_4team.dao.Impl.MenuOrderDaoImpl;
import yi_java4st_4team.dao.Impl.ui.content.SelectedMenuOrderTable;
import yi_java4st_4team.dto.Menu;
import yi_java4st_4team.dto.MenuOrder;

public class MenuOrderService {
	private MenuOrderDao dao = MenuOrderDaoImpl.getInstance();
	
	public List<MenuOrder> getMenuOrderList(){
		return dao.selectMenuOrderByAll();		
	}
	
	public void addMenuOrder(MenuOrder mo) {
		dao.insertMeunOrder(mo);
	}
	
	public void removeMainFood(MenuOrder mo) {
		dao.deleteMenuOrder(mo);
	}

}

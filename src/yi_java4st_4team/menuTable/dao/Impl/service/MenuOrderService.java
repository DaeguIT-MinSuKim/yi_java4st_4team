package yi_java4st_4team.menuTable.dao.Impl.service;

import java.util.List;

import yi_java4st_4team.menuTable.dao.MenuDao;
import yi_java4st_4team.menuTable.dao.MenuOrderDao;
import yi_java4st_4team.menuTable.dao.Impl.MenuDaoImpl;
import yi_java4st_4team.menuTable.dao.Impl.MenuOrderDaoImpl;
import yi_java4st_4team.menuTable.dao.Impl.ui.content.SelectedMenuOrderTable;
import yi_java4st_4team.menuTable.dto.Menu;
import yi_java4st_4team.menuTable.dto.MenuOrder;

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

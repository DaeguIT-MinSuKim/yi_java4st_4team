package yi_java4st_4team.menuTable.dao.Impl.service;

import java.util.List;

import yi_java4st_4team.menuTable.dao.MenuOrderDao;
import yi_java4st_4team.menuTable.dao.Impl.MenuOrderDaoImpl;
import yi_java4st_4team.menuTable.dto.MenuOrder;
import yi_java4st_4team.menuTable.dto.TableInfo;

public class MenuOrderService {
	private MenuOrderDao dao = MenuOrderDaoImpl.getInstance();
	
	public List<MenuOrder> getMenuOrderList(){
		return dao.selectMenuOrderByAll();		
	}
	
	public int addMenuOrder(MenuOrder mo) {
		System.out.println("MenuOrderService mo~~~~~ : " + mo);
		return dao.insertMeunOrder(mo);
	}
	
	public int removeMainFood(MenuOrder mo) {
		return dao.deleteMenuOrder(mo);
	}
	
	public List<MenuOrder> selectOrderByTableNo(TableInfo tInfo) {
		return dao.selectOrderByTableNo(tInfo);
	}

	public int updateMenuOrder(MenuOrder mo) {
		return dao.updateMenuOrder(mo);
	}
}

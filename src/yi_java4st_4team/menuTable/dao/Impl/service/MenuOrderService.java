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
	
	public void addMenuOrder(MenuOrder mo) {
		dao.insertMeunOrder(mo);
	}
	
	public void removeMainFood(MenuOrder mo) {
		dao.deleteMenuOrder(mo);
	}
	
	public List<MenuOrder> selectOrderByTableNo(TableInfo tInfo) {
		return dao.selectOrderByTableNo(tInfo);
	}

}

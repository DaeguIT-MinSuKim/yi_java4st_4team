package yi_java4st_4team.menuTable.dao.Impl.service;

import java.util.List;

import yi_java4st_4team.menuTable.dao.MenuDao;
import yi_java4st_4team.menuTable.dao.Impl.MenuDaoImpl;
import yi_java4st_4team.menuTable.dto.Menu;

public class MenuService {
	private MenuDao dao = MenuDaoImpl.getInstance();
	
	public List<Menu> getMenuList(String type){
		return dao.selectMenuByMenu(type);	
	}
	
//	public void addMenuOrder(MenuOrder mo) {
//		dao.insertMeunOrder(mo);
//	}
//	
//	public void removeMainFood(MenuOrder mo) {
//		dao.deleteMenuOrder(mo);
//	}

}

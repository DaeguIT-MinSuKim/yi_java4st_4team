package yi_java4st_4team.dao.Impl.service;

import java.util.List;

import yi_java4st_4team.dao.MenuDao;
import yi_java4st_4team.dao.Impl.MenuDaoImpl;
import yi_java4st_4team.dto.Menu;

public class MenuService {
	private MenuDao dao = MenuDaoImpl.getInstance();
	public void addMau(Menu m) {
		dao.intsertMenu(m);
	}
	
	public List<Menu> getMainFoodList(){
		return dao.selectMenuByAll();
		
	}
	
	public void removeMainFood(Menu m) {
		dao.deleteMenu(m);
	}
	
	public void editMainFood(Menu m) { 
		dao.updateMenu(m);
	}

}

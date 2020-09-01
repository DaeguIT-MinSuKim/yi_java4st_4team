package yi_java4st_4team.menuTable.dao;

import java.util.List;

import yi_java4st_4team.menuTable.dto.Menu;

public interface MenuDao {
	List<Menu> selectMenuByMenu(String type);
	
	int intsertMenu(Menu m);
	
	int updateMenu(Menu m);
	
	int deleteMenu(Menu m);
	
	Menu selectMenuByMenuCode(Menu m);

}

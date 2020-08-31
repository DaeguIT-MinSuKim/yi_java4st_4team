package yi_java4st_4team.dao;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import yi_java4st_4team.menuTable.dao.Impl.MenuDaoImpl;
import yi_java4st_4team.menuTable.dto.Menu;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MenuDaoTest {

	@Test
	public void testSelectMenuByAll() {
		System.out.println("testSelectMenuByAll()");
		List<Menu> list = MenuDaoImpl.getInstance().selectMenuByAll();
		Assert.assertNotNull(list);
		list.stream().forEach(System.out::println);
	}

	@Test
	public void test1IntsertMenu() {
		System.out.println("test1IntsertMenu()");
		Menu menu = new Menu("B05", "아이스크림", 2000);
		int res = MenuDaoImpl.getInstance().intsertMenu(menu);
		Assert.assertEquals(1, res);
		System.out.println(res);
	}

	@Test
	public void test2UpdateMenu() {
		System.out.println("test2UpdateMenu()");
		Menu modifiyMenu = MenuDaoImpl.getInstance().selectMenuByMenuCode(new Menu("B05"));
		System.out.println("befor : " + modifiyMenu);
		//CODE,NAME,PRICE		
		modifiyMenu.setName("아메리카노");
		modifiyMenu.setPrice(4000);
		int res = MenuDaoImpl.getInstance().updateMenu(modifiyMenu);
		Menu afterMenu = MenuDaoImpl.getInstance().selectMenuByMenuCode(new Menu("B05"));
		System.out.println("after : " + afterMenu);
		Assert.assertEquals(1, res);
		
	}

	@Test
	public void test3DeleteMenu() {
		System.out.println("test3DeleteMenu()");
		int res = MenuDaoImpl.getInstance().deleteMenu(new Menu("B05"));
		Assert.assertEquals(1, res);
	}


}

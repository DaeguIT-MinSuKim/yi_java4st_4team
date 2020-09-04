package yi_java4st_4team.dao;

import static org.junit.Assert.fail;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import yi_java4st_4team.menuTable.dao.MenuOrderDao;
import yi_java4st_4team.menuTable.dao.Impl.MenuOrderDaoImpl;
import yi_java4st_4team.menuTable.dto.MenuOrder;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MenuOrderDaoTest {
	private MenuOrderDao dao = MenuOrderDaoImpl.getInstance();
	
//	@Test
	public void testSelectMeunOrderByAll() {
		System.out.println("testSelectMeunOrderByAll()");
		List<MenuOrder> list = dao.selectMenuOrderByAll();
		Assert.assertNotNull(list);
		list.stream().forEach(System.out::println);
	}

	/*
	 * @Test public void test1InsertMeunOrder() {
	 * System.out.println("testInsertMeunOrder()"); MenuOrder newMo = new
	 * MenuOrder(9, "M01", new Date(), 10, 0); int res =
	 * MenuOrderDaoImpl.getInstance().insertMeunOrder(newMo); Assert.assertEquals(1,
	 * res); System.out.println(res); }
	 * 
	 * @Test public void test3DeleteMenuOrder() {
	 * System.out.println("test3DeleteMenuOrder()"); int res =
	 * MenuOrderDaoImpl.getInstance().deleteMenuOrder(new MenuOrder(9));
	 * Assert.assertEquals(1, res);
	 * 
	 * }
	 * 
	 * @Test public void test2UpdateMenuOrder() {
	 * System.out.println("testUpdateMenuOrder()"); MenuOrder modifyMo =
	 * MenuOrderDaoImpl.getInstance().selectByOrderNo(new MenuOrder(9));
	 * System.out.println("before : " + modifyMo); //CODE, ORDERDAY, CNT, ISPAYMENT,
	 * NO modifyMo.setCode("M02"); modifyMo.setCnt(5); modifyMo.setIsPayment(0);
	 * Calendar cal = Calendar.getInstance(); cal.clear(); cal.set(2020,10, 24);
	 * modifyMo.setOrderday(cal.getTime()); int res =
	 * MenuOrderDaoImpl.getInstance().updateMenuOrder(modifyMo); MenuOrder afterMo =
	 * MenuOrderDaoImpl.getInstance().selectByOrderNo(new MenuOrder(9));
	 * System.out.println("after : " + afterMo); Assert.assertEquals(1, res); }
	 */
	
//	@Test
//	public void selectByOrderNo() {
//		System.out.println("selectByOrderNo");
//		MenuOrder smo = MenuOrderDaoImpl.getInstance().selectByOrderNo(new MenuOrder(1));
//		Assert.assertNotNull(smo);
//		System.out.println(smo);
//	
//		
//	}
	
	@Test
	public void testSelectSellAllByAll() {
		System.out.println("testSelectSellAllByAll");
		List<MenuOrder> list = dao.selectSellAllByAll();
		Assert.assertNotNull(list);
		list.stream().forEach(System.out::println);
	}
	
}

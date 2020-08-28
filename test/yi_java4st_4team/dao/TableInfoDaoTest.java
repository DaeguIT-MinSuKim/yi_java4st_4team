package yi_java4st_4team.dao;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import yi_java4st_4team.dao.Impl.TableInfoDaoImpl;
import yi_java4st_4team.dto.TableInfo;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TableInfoDaoTest {

	@Test
	public void testSelectTableInfoByAll() {
		System.out.println("testSelectTableInfoByAll()");
		List<TableInfo> list = TableInfoDaoImpl.getInstance().selectTableInfoByAll();
		Assert.assertNotNull(list);
		list.stream().forEach(System.out::println);
	}

	@Test
	public void test1IntsertTableInfo() {
		System.out.println("test1IntsertTableInfo()");
		TableInfo newTi = new TableInfo(9, "단체테이블");
		int res = TableInfoDaoImpl.getInstance().intsertTableInfo(newTi);
		Assert.assertNotNull(newTi);
		System.out.println(newTi);
		
		
		
	}

	@Test
	public void test2UpdateTableInfo() {
		System.out.println("test2UpdateTableInfo()");
		TableInfo modifyTi = TableInfoDaoImpl.getInstance().selectTableInfoDaoByTableNo(new TableInfo(9));
		System.out.println("befor : " + modifyTi);
		//NO, NAME
		modifyTi.setName("9번테이블");
		int res = TableInfoDaoImpl.getInstance().updateTableInfo(modifyTi);
		TableInfo afterTi = TableInfoDaoImpl.getInstance().selectTableInfoDaoByTableNo(new TableInfo(9));
		System.out.println("after : " + afterTi);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test3DeleteTableInfo() {
		System.out.println("test3DeleteTableInfo()");
		int res = TableInfoDaoImpl.getInstance().deleteTableInfo(new TableInfo(9));
		Assert.assertEquals(1, res);
	}



}

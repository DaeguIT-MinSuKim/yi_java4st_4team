package yi_java4st_4team.conn;

import java.sql.Connection;

import org.junit.Assert;
import org.junit.Test;

public class JdbcUtilTest {

	@Test
	public void testGetConnection() {
		Connection con = JdbcUtil.getConnection();
		Assert.assertNotNull(con);
		System.out.println(con);
	}

}

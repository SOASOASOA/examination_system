package cn.soa.examsystem.test.dao;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

import javax.sql.DataSource;

import org.junit.Test;

public class JdbcTest extends BaseTest{
	@Test
	public void jdbcTest() throws Exception{
		DataSource ds=ctx.getBean("dataSource",DataSource.class);
		System.out.println(ds);
		Connection conn=ds.getConnection();
		DatabaseMetaData md=conn.getMetaData();
		System.out.println(md);
		//查询数据库版本
		String n = md.getDatabaseProductName();
		String v = md.getDatabaseProductVersion();
		System.out.println(n+v); 
		conn.close();
	}
}

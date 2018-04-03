package cn.soa.examsystem.test.dao;

import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseTest {
	public ClassPathXmlApplicationContext ctx;
	@Before
	public void init(){
		ctx=new ClassPathXmlApplicationContext(
				"conf/spring-web.xml",
				"conf/spring-mybatis.xml",
				"conf/spring-util.xml",
				"conf/spring-service.xml" 			
				);
	}
}

package cn.soa.cloudnote.test;

import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseTest {
	ClassPathXmlApplicationContext cx;
	@Before
	public void init(){
		cx=new ClassPathXmlApplicationContext(
				"conf/spring-web.xml",
				"conf/spring-mybatis.xml",
				"conf/spring-service.xml"			
				);
	}
}

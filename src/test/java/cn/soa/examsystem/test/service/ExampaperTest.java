
    /**  
    * @Title: MainTest.java
    * @Package cn.soa.examsystem.test.service
    * @Description: TODO(用一句话描述该文件做什么)
    * @author zhugang
    * @date 2018年3月24日
    * @version V1.0  
    */
    
package cn.soa.examsystem.test.service;

import org.junit.Before;
import org.junit.Test;

import cn.soa.examsystem.entity.User;
import cn.soa.examsystem.service.impl.MainService;
import cn.soa.examsystem.test.dao.BaseTest;

/**
    * @ClassName: MainTest
    * @Description: service层测试类
    * @author zhugang
    * @date 2018年3月24日
    *
    */

public class ExampaperTest extends BaseTest {
	
	private MainService mainService;
	
	@Before
	public void initUserDao(){
		mainService = ctx.getBean("mainService",MainService.class);
	}
	
	@Test
	public void getUserInfoByUserAccountTest()
	{
		String account = "刘备";
		User user = mainService.getUserInfoByUserAccount(account);
		System.out.println(user);
	}
}

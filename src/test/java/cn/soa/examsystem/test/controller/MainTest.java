
    /**  
    * @Title: MainTest.java
    * @Package cn.soa.examsystem.test.service
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author zhugang
    * @date 2018��3��24��
    * @version V1.0  
    */
    
package cn.soa.examsystem.test.controller;

import org.junit.Before;
import org.junit.Test;

import cn.soa.examsystem.controller.MainController;
import cn.soa.examsystem.entity.User;
import cn.soa.examsystem.test.dao.BaseTest;
import cn.soa.examsystem.util.JsonResult;

/**
    * @ClassName: MainTest
    * @Description: controller�������
    * @author zhugang
    * @date 2018��3��24��
    *
    */

public class MainTest extends BaseTest {
	
	private MainController mainController;
	
	@Before
	public void initUserDao(){
		mainController = ctx.getBean("mainController",MainController.class);
	}
	
	@Test
	public void getUserInfoByUserAccountTest()
	{
		String account = "";
		JsonResult<User> json = mainController.getUerInfoByUserAccount(account);
		System.out.println(json);
	}
}

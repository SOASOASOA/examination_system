package cn.soa.examsystem.test.dao;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import cn.soa.examsystem.dao.LoginDAO;
import cn.soa.examsystem.dao.UserManagementDao;
import cn.soa.examsystem.entity.Admin;

public class LoginDaoTest extends BaseTest{	
	
	private LoginDAO ld;
	
	@Before
	public void initUserDao(){
		ld = ctx.getBean("loginDAO",LoginDAO.class);
	}
	
	@Test
	public void findUserIdByName()
	{
		Map<String, Object> findUserIdByName = ld.findUserIdByName("admin");
		System.out.println(findUserIdByName);
		
	}
}

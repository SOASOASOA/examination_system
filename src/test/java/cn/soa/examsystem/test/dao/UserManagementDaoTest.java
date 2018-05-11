package cn.soa.examsystem.test.dao;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import cn.soa.examsystem.dao.UserManagementDao;

public class UserManagementDaoTest extends BaseTest{	
	
	private UserManagementDao ud;
	
	@Before
	public void initUserDao(){
		ud = ctx.getBean("userManagementDao",UserManagementDao.class);
	}
	
	@Test
	public void findUserFunctionlByID()
	{
		List<Map<String, Object>> findUserFunctionlByID = ud.findUserFunctionlByID("18f4caf6-6ee6-4b28-c023-d46e34b3a8e9");
		for (Map<String, Object> map : findUserFunctionlByID) {
			System.out.println(map);
		}
		
	}
	@Test
	public void findUserInfoByUserID()
	{
		List<Map<String, Object>> findUserFunctionlByID = ud.findUserInfoByUserID("7fcc3e0f-522b-c92f-0382-b7386bdf4e73",0,1);
		for (Map<String, Object> map : findUserFunctionlByID) {
			System.out.println(map);
		}
	}
	@Test
	public void findChildRoleByUserID()
	{
		List<String> findUserFunctionlByID = ud.findChildRoleByUserID("7fcc3e0f-522b-c92f-0382-b7386bdf4e73");
		for (String string : findUserFunctionlByID) {
			System.out.println(string);
		}
	}
}

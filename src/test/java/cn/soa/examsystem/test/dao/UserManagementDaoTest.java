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
}

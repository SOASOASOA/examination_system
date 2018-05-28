package cn.soa.examsystem.test.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import cn.soa.examsystem.dao.UserManagementDao;
import cn.soa.examsystem.entity.Admin;

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
		List<Map<String, Object>> findChildRoleByUserID = ud.findChildRoleByUserID("7fcc3e0f-522b-c92f-0382-b7386bdf4e73");
		for (Map<String, Object> map : findChildRoleByUserID) {
			System.out.println(map);
		}
	}
	@Test
	public void addNewUserByUosID()
	{
		Admin admin = new Admin();
		admin.setUser_id("8bc77f1f-a539-487b-a060-c79345e3ece4");
		admin.setUser_account("admin1");
		admin.setUser_password("123");
		admin.setUser_regist_time("2018-05-22 03:49:09");
		admin.setUser_name("1231");
		admin.setUser_certificaiton_num("123131");
		admin.setUos_id("ccf41ce7-4544-49f6-92ad-100b67fe99e4");
		admin.setUser_sex(null);
		Integer addNewUserByUosID = ud.addNewUser(admin);
	}
	
	@Test
	public void updateUser()
	{
		Admin admin = new Admin();
		admin.setUser_id("8bc77f1f-a539-487b-a060-c79345e3ece4");
		Integer updateUser = ud.updateUser(admin);
		System.out.println(updateUser);
	}
	
	@Test
	public void updatePasswordByID()
	{
		List<String> lists=new ArrayList<String>();
		lists.add("b2e71cea-037d-4d63-9bc6-389d2486dca3");
		lists.add("e97a3f6f-07ed-4b97-9d82-669ea21f604c");
		Integer updatePasswordByID = ud.updatePasswordByID(lists);
		System.out.println(updatePasswordByID);
	}
}

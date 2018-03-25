package cn.soa.examsystem.test.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import cn.soa.examsystem.dao.UserDao;
import cn.soa.examsystem.entity.User;



public class UserDaoTest extends BaseTest{	
	
	private UserDao userDao;
	
	@Before
	public void initUserDao(){
		userDao = ctx.getBean("userDao",UserDao.class);
	}
	/*
	@Test
	public void getMainPageInfoByAccountTest()
	{
		String userAccount = "刘备";
		List<Map<String,String>> list = userDao.getMainPageInfoByAccount(userAccount);
		System.out.println(list);
	}
	
	@Test
	public void getUserInfoByUserAccount() 
	{
		String userAccount = "刘备";
		User user = userDao.getUserInfoByUserAccount(userAccount);
		System.out.println(user);
	}
	
	@Test
	public void getUserPwdByUserAccount()
	{
		String userAccount = "刘备";
		String userPwd = userDao.getUserPwdByUserAccount(userAccount);
		System.out.println(userPwd);				
	}
	
	@Test
	public void getUserPwdByUserName()
	{
		String userName = "刘备";
		String userPwd = userDao.getUserPwdByUserAccount(userName);
		System.out.println(userPwd);				
	}
	
	@Test
	public void getUserInfoByUserName()
	{
		String userName = "刘备";
		User user = userDao.getUserInfoByUserName(userName);
		System.out.println(user);				
	}
	
	@Test
	public void changeUserPwdByUserAccount()
	{
		String userAccount = "test";
		String userNewPwd = "654321" ;
		int i = userDao.changeUserPwdByUserAccount(userAccount, userNewPwd);
		System.out.println(i);				
	}
	
	@Test
	public void addUserInfo()
	{
		User user = new User("asdas15864asdfdeftfgh58ftr22478tzds6", "test1", "123456", new Date(), new Date(), "魏延", new Integer(0),
				"512444564123028624", "斯欧", new Date(), new Integer(1), "魏国卧底", "17756458669", "shuguoyouxiang@qq.com");
		int i = userDao.addUserInfo(user);
		System.out.println(i);				
	}
	
	@Test
	public void deleteUserInfo()
	{
		String userAccount = "test1";
		int i = userDao.deleteUserInfo(userAccount);
		System.out.println(i);
	}
	*/
}

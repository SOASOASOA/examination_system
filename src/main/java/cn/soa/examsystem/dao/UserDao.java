
    /**  
    * @Title: UserDao.java
    * @Package cn.soa.examsystem.dao.main.inter
    * @Description: TODO(用一句话描述该文件做什么)
    * @author zhugang
    * @date 2018年3月20日
    * @version V1.0  
    */
    
package cn.soa.examsystem.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.soa.examsystem.entity.User;

/**
    * @ClassName: UserDao
    * @Description: 用户dao
    * @author zhugang
    * @date 2018年3月20日
    *
    */
@Repository
public interface UserDao {
	
	//user相关
	/*
	 * 根据用户账号查询用户信息
	 */
	public User getUserInfoByUserAccount(String userAccount);
	
	/*
	 * 根据用户账号查询用户密码
	 */
	public String getUserPwdByUserAccount(String userAccount);
	
	/*
	 * 根据用户姓名查询用户信息
	 */
	public User getUserInfoByUserName(String userName);
	
	/*
	 * 根据用户姓名查询用户密码
	 */
	public String getUserPwdByUserName(String userName);
	
	/*
	 * 根据用户账号修改用户密码
	 */
	public int changeUserPwdByUserAccount(String userAccount , String userNewPwd);
	
	/*
	 * 根据用户姓名修改用户密码
	 */
	public int changeUserInfoByUserName(String userAccount);
	
	/*
	 * 增加用户
	 */
	public int addUserInfo(User user);
	
	/*
	 * 根据用户账号删除用户
	 */
	public int deleteUserInfo(String userAccount);
	
	
	//角色相关
	
	
	//权限相关
	
	
	//功能相关
	/*
	 * 根据用户账号查询具有的功能模块
	 */
	public List<Map<String,String>> getMainPageInfoByAccount(String userAccount);
	
}

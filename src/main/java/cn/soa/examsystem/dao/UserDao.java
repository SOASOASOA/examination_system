
    /**  
    * @Title: UserDao.java
    * @Package cn.soa.examsystem.dao.main.inter
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author zhugang
    * @date 2018��3��20��
    * @version V1.0  
    */
    
package cn.soa.examsystem.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.soa.examsystem.entity.User;

/**
    * @ClassName: UserDao
    * @Description: �û�dao
    * @author zhugang
    * @date 2018��3��20��
    *
    */
@Repository
public interface UserDao {
	
	//user���
	/*
	 * �����û��˺Ų�ѯ�û���Ϣ
	 */
	public User getUserInfoByUserAccount(String userAccount);
	
	/*
	 * �����û��˺Ų�ѯ�û�����
	 */
	public String getUserPwdByUserAccount(String userAccount);
	
	/*
	 * �����û�������ѯ�û���Ϣ
	 */
	public User getUserInfoByUserName(String userName);
	
	/*
	 * �����û�������ѯ�û�����
	 */
	public String getUserPwdByUserName(String userName);
	
	/*
	 * �����û��˺��޸��û�����
	 */
	public int changeUserPwdByUserAccount(String userAccount , String userNewPwd);
	
	/*
	 * �����û������޸��û�����
	 */
	public int changeUserInfoByUserName(String userAccount);
	
	/*
	 * �����û�
	 */
	public int addUserInfo(User user);
	
	/*
	 * �����û��˺�ɾ���û�
	 */
	public int deleteUserInfo(String userAccount);
	
	
	//��ɫ���
	
	
	//Ȩ�����
	
	
	//�������
	/*
	 * �����û��˺Ų�ѯ���еĹ���ģ��
	 */
	public List<Map<String,String>> getMainPageInfoByAccount(String userAccount);
	
}

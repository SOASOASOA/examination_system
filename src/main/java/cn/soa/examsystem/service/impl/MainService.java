
    /**  
    * @Title: MainService.java
    * @Package cn.soa.examsystem.service.main.impl
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author zhugang
    * @date 2018��3��24��
    * @version V1.0  
    */
    
package cn.soa.examsystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.soa.examsystem.dao.UserDao;
import cn.soa.examsystem.entity.User;

/**
    * @ClassName: MainService
    * @Description: ��ҳ����ʵ����
    * @author zhugang
    * @date 2018��3��24��
    *
    */
@Service("mainService")
public class MainService {
	@Autowired
	public UserDao userDao;
	
	public User getUserInfoByUserAccount(String userAccount)
	{
		User user = userDao.getUserInfoByUserAccount(userAccount);
		return user;
	}
}

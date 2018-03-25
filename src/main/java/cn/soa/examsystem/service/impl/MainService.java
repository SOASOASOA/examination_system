
    /**  
    * @Title: MainService.java
    * @Package cn.soa.examsystem.service.main.impl
    * @Description: TODO(用一句话描述该文件做什么)
    * @author zhugang
    * @date 2018年3月24日
    * @version V1.0  
    */
    
package cn.soa.examsystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.soa.examsystem.dao.UserDao;
import cn.soa.examsystem.entity.User;

/**
    * @ClassName: MainService
    * @Description: 主页服务实现类
    * @author zhugang
    * @date 2018年3月24日
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

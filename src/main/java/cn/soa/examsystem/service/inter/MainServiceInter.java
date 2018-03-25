
    /**  
    * @Title: UserService.java
    * @Package cn.soa.examsystem.service.main.inter
    * @Description: 主页服务接口
    * @author zhugang
    * @date 2018年3月24日
    * @version V1.0  
    */
    
package cn.soa.examsystem.service.inter;


import cn.soa.examsystem.entity.User;

/**
    * @ClassName: 主页业务服务接口
    * @Description: 
    * @author zhugang
    * @date 2018年3月24日
    *
    */

public interface MainServiceInter {
	/*
	 * 获取用户信息
	 */
	public User getUserInfoByUserAccount(String account);
	
}

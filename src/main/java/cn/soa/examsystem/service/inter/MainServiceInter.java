
    /**  
    * @Title: UserService.java
    * @Package cn.soa.examsystem.service.main.inter
    * @Description: ��ҳ����ӿ�
    * @author zhugang
    * @date 2018��3��24��
    * @version V1.0  
    */
    
package cn.soa.examsystem.service.inter;


import cn.soa.examsystem.entity.User;

/**
    * @ClassName: ��ҳҵ�����ӿ�
    * @Description: 
    * @author zhugang
    * @date 2018��3��24��
    *
    */

public interface MainServiceInter {
	/*
	 * ��ȡ�û���Ϣ
	 */
	public User getUserInfoByUserAccount(String account);
	
}

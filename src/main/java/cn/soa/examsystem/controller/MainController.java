
    /**  
    * @Title: MainController.java
    * @Package cn.soa.examsystem.controller.main
    * @Description: ��ҳģ����Ʋ�
    * @author zhugang
    * @date 2018��3��24��
    * @version V1.0  
    */
    
package cn.soa.examsystem.controller;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.soa.examsystem.entity.User;
import cn.soa.examsystem.service.impl.MainService;
import cn.soa.examsystem.util.JsonResult;

/**
    * @ClassName: MainController
    * @Description: ��ҳģ����Ʋ㷽��
    * @author zhugang
    * @date 2018��3��24��
    *
    */

@RestController("mainController")
@RequestMapping("/main")
public class MainController {
	@Autowired
	public MainService mainService;
	
	@RequestMapping("/userInfo.do")
	public JsonResult<User> getUerInfoByUserAccount(@NotEmpty String userAccount)
	{
		User user = mainService.getUserInfoByUserAccount(userAccount);
		if(user != null )
		{
			return new JsonResult<User>(0,user);
		}
		return null;
	}
}

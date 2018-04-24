
    /**  
    * @Title: Test.java
    * @Package cn.soa.examsystem.controller
    * @Description: TODO(用一句话描述该文件做什么)
    * @author zhugang
    * @date 2018年4月23日
    * @version V1.0  
    */
    
package cn.soa.examsystem.controller;

import java.util.UUID;

import cn.soa.examsystem.util.ExaminUtil;

/**
    * @ClassName: Test
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author zhugang
    * @date 2018年4月23日
    *
    */

public class Test {
	public static void main(String[] args) {
		String md5 = ExaminUtil.toMD5("123456");
		System.out.println(md5);
	}
}

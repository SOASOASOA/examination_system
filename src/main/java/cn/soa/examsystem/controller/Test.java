
    /**  
    * @Title: Test.java
    * @Package cn.soa.examsystem.controller
    * @Description: TODO(用一句话描述该文件做什么)
    * @author zhugang
    * @date 2018年4月23日
    * @version V1.0  
    */
    
package cn.soa.examsystem.controller;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
		List<String> closedList = new LinkedList<String>();
		List<String> closedList1 = new LinkedList<String>();
		closedList.add("1");
		closedList.add("2");
		closedList1.add("1");
		closedList1.add("2");
		closedList1.add("3");
		closedList1.removeAll(closedList);
		System.out.println(closedList1);
	}
}

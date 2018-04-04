
    /**  
    * @Title: ExamPaperUtils.java
    * @Package cn.soa.examsystem.util
    * @Description: TODO(用一句话描述该文件做什么)
    * @author zhugang
    * @date 2018年3月29日
    * @version V1.0  
    */
    
package cn.soa.examsystem.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.soa.examsystem.entity.ExamPaper;

/**
    * @ClassName: ExamPaperUtils
    * @Description: 试题模块工具类
    * @author zhugang
    * @date 2018年3月29日
    *
    */
@Component
public class ExamPaperUtils {
	
	@Autowired
	public  PropertiesUtils propertiesUtils;

		/**
	    * @Title: transferEntityIntoMap
	    * @Description: 把实体类转为map
	    * @param @param object
	    * @param @return    参数说明
	    * @return Map<String,String>    返回类型
	    * @throws
	    */	    
	public static Map<String, String> transferEntityIntoMap(Object object)
	{		
		return null;
	} 
	
	    /**
	    * @Title: removeValueNullInMap
	    * @Description: 去掉map中value为空的entry
	    * @param @param map
	    * @param @return    参数说明
	    * @return Map<String,String>    返回类型
	    * @throws
	    */	    
	public static Map<String, String> removeValueNullInMap(Map<String, String> map)
	{		
		Map<String, String> returnMap = new HashMap<String, String>();
		for (Map.Entry<String, String> entry : map.entrySet()) 
		{  
		    String key = entry.getKey().toString();  
		    String value = entry.getValue().toString();  
		    if(value == null || value.isEmpty() || value.trim().isEmpty()) 
		    {
		    	continue;
		    }
		    returnMap.put(key, value);
		}
		return returnMap;
	}
	
	
	
	    /**
	    * @Title: getCountFromList
	    * @Description: 获取list的长度
	    * @param @param list
	    * @param @return    参数说明
	    * @return String    返回类型
	    * @throws
	    */
	    
	public static String getCountFromList(List<ExamPaper> returnExampaperList)
	{
		return returnExampaperList.size()+"";
	}
	
	
	
	    /**
	    * @Title: transferNameMatchSQLInMap
	    * @Description: 修改map中key，以满足数据库访问需要
	    * @param @param paramMap
	    * @param @return    参数说明
	    * @return Map<String,String>    返回类型
	    * @throws
	    */
	    
	public  Map<String, String> transferNameMatchSQLInMap(Map<String, String> map)
	{
		Map<String, String> returnMap = new HashMap<String, String>();
		for (Map.Entry<String, String> entry : map.entrySet()) 
		{  
		    String key = entry.getKey().toString();  
		    String value = entry.getValue().toString(); 
		    Boolean b = propertiesUtils.examPaperMap.containsKey(key);
		    if(b)
		    {
		    	returnMap.put(propertiesUtils.examPaperMap.get(key), value);
		    } else
		    {
		    	returnMap.put(key, value);
		    }
		}
		return returnMap;
	}
	
}

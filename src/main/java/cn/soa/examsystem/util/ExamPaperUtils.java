
    /**  
    * @Title: ExamPaperUtils.java
    * @Package cn.soa.examsystem.util
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author zhugang
    * @date 2018��3��29��
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
    * @Description: ����ģ�鹤����
    * @author zhugang
    * @date 2018��3��29��
    *
    */
@Component
public class ExamPaperUtils {
	
	@Autowired
	public  PropertiesUtils propertiesUtils;

		/**
	    * @Title: transferEntityIntoMap
	    * @Description: ��ʵ����תΪmap
	    * @param @param object
	    * @param @return    ����˵��
	    * @return Map<String,String>    ��������
	    * @throws
	    */	    
	public static Map<String, String> transferEntityIntoMap(Object object)
	{		
		return null;
	} 
	
	    /**
	    * @Title: removeValueNullInMap
	    * @Description: ȥ��map��valueΪ�յ�entry
	    * @param @param map
	    * @param @return    ����˵��
	    * @return Map<String,String>    ��������
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
	    * @Description: ��ȡlist�ĳ���
	    * @param @param list
	    * @param @return    ����˵��
	    * @return String    ��������
	    * @throws
	    */
	    
	public static Integer getCountFromList(List<ExamPaper> returnExampaperList)
	{
		return returnExampaperList.size();
	}
	
	
	
	    /**
	    * @Title: transferNameMatchSQLInMap
	    * @Description: �޸�map��key�����������ݿ������Ҫ
	    * @param @param paramMap
	    * @param @return    ����˵��
	    * @return Map<String,String>    ��������
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

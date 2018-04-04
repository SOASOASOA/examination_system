
    /**  
    * @Title: PropertiesUtils.java
    * @Package cn.soa.examsystem.util
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author zhugang
    * @date 2018��3��31��
    * @version V1.0  
    */
    
package cn.soa.examsystem.util;

import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
    * @ClassName: PropertiesUtils
    * @Description: Properties�����ļ�������
    * @author zhugang
    * @date 2018��3��31��
    *
    */
@Component
@Configuration 
public class PropertiesUtils {	
	
	    /**
	    * @Fields examPaperMap : ��ȡ����MapΪ�Ķ���
	    */	    
	@Resource(name="examPaperProperties")
    public Map<String, String> examPaperMap;
		
	    /**
	    * @Fields examPaperProperties :��ȡ����PropertiesΪ�Ķ���
	    */	    
	@Resource(name="examPaperProperties")
    public Properties examPaperProperties;
		
	    /**
	    * @Fields s : ��ȡ����key  value ֵ
	    */
	    
	@Value("#{examPaperProperties.id}") 
	public String s;
	
}

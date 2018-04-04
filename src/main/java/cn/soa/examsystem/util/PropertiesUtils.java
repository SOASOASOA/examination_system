
    /**  
    * @Title: PropertiesUtils.java
    * @Package cn.soa.examsystem.util
    * @Description: TODO(用一句话描述该文件做什么)
    * @author zhugang
    * @date 2018年3月31日
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
    * @Description: Properties配置文件工具类
    * @author zhugang
    * @date 2018年3月31日
    *
    */
@Component
@Configuration 
public class PropertiesUtils {	
	
	    /**
	    * @Fields examPaperMap : 获取类型Map为的对象
	    */	    
	@Resource(name="examPaperProperties")
    public Map<String, String> examPaperMap;
		
	    /**
	    * @Fields examPaperProperties :获取类型Properties为的对象
	    */	    
	@Resource(name="examPaperProperties")
    public Properties examPaperProperties;
		
	    /**
	    * @Fields s : 获取具体key  value 值
	    */
	    
	@Value("#{examPaperProperties.id}") 
	public String s;
	
}

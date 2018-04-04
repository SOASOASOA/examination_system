
    /**  
    * @Title: JsonResultForTable.java
    * @Package cn.soa.examsystem.util
    * @Description: TODO(用一句话描述该文件做什么)
    * @author zhugang
    * @date 2018年3月30日
    * @version V1.0  
    */
    
package cn.soa.examsystem.util;

import java.io.Serializable;


/**
    * @ClassName: JsonResultForTable
    * @Description: 返回表格用json的实体类
    * @author zhugang
    * @date 2018年3月30日
    *
    */

public class JsonResultForTable<T> implements Serializable{

	
	    /**
	    * @Fields serialVersionUID : 序列化
	    */
	    
	private static final long serialVersionUID = 1L;
	
	
	    /**
	    * @Fields code : 状态码，1失败  0成功
	    */
	    

	private String code;
	
	
	    /**
	    * @Fields msg : 返回文本信息
	    */
	    
	private String msg;
	
	
	    /**
	    * @Fields count : 返回数据条数
	    */
	    
	private String count;
	
	
	    /**
	    * @Fields data : 返回数据json
	    */
	    
	private T data;


		
	    /**
	     * 创建一个新的实例 JsonResultForTable.
	     *
	     */
	    
	public JsonResultForTable() {
		super();
		// TODO Auto-generated constructor stub
	}



	
	    /**
	     * 创建一个新的实例 JsonResultForTable.
	     *
	     * @param code
	     * @param msg
	     * @param count
	     * @param examPaper
	     */
	    
	public JsonResultForTable(String code, String msg, String count,
			T data) {
		super();
		this.code = code;
		this.msg = msg;
		this.count = count;
		this.data = data;
	}




	
	/**
	* @return code
	*/
	
	public String getCode() {
		return code;
	}




	
	/**
	 * @param code the code to set
	 */
	
	public void setCode(String code) {
		this.code = code;
	}




	
	/**
	* @return msg
	*/
	
	public String getMsg() {
		return msg;
	}




	
	/**
	 * @param msg the msg to set
	 */
	
	public void setMsg(String msg) {
		this.msg = msg;
	}




	
	/**
	* @return count
	*/
	
	public String getCount() {
		return count;
	}




	
	/**
	 * @param count the count to set
	 */
	
	public void setCount(String count) {
		this.count = count;
	}




	
	/**
	* @return examPaper
	*/
	
	public T getExamPaper() {
		return data;
	}




	
	/**
	 * @param examPaper the examPaper to set
	 */
	
	public void setExamPaper(T data) {
		this.data = data;
	}


	
		
}

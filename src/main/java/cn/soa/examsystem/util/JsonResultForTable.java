
    /**  
    * @Title: JsonResultForTable.java
    * @Package cn.soa.examsystem.util
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author zhugang
    * @date 2018��3��30��
    * @version V1.0  
    */
    
package cn.soa.examsystem.util;

import java.io.Serializable;


/**
    * @ClassName: JsonResultForTable
    * @Description: ���ر����json��ʵ����
    * @author zhugang
    * @date 2018��3��30��
    *
    */

public class JsonResultForTable<T> implements Serializable{

	
	    /**
	    * @Fields serialVersionUID : ���л�
	    */
	    
	private static final long serialVersionUID = 1L;
	
	
	    /**
	    * @Fields code : ״̬�룬1ʧ��  0�ɹ�
	    */
	    

	private String code;
	
	
	    /**
	    * @Fields msg : �����ı���Ϣ
	    */
	    
	private String msg;
	
	
	    /**
	    * @Fields count : ������������
	    */
	    
	private String count;
	
	
	    /**
	    * @Fields data : ��������json
	    */
	    
	private T data;


		
	    /**
	     * ����һ���µ�ʵ�� JsonResultForTable.
	     *
	     */
	    
	public JsonResultForTable() {
		super();
		// TODO Auto-generated constructor stub
	}



	
	    /**
	     * ����һ���µ�ʵ�� JsonResultForTable.
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

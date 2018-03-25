
    /**  
    * @Title: UserFunction.java
    * @Package cn.soa.examsystem.entity
    * @Description: TODO(��һ�仰�������ļ���ʲô)
    * @author zhugang
    * @date 2018��3��22��
    * @version V1.0  
    */
    
package cn.soa.examsystem.entity;

import java.io.Serializable;

/**
    * @ClassName: UserFunction
    * @Description: �û������еĹ���ģ��
    * @author zhugang
    * @date 2018��3��22��
    *
    */

public class UserFunction implements Serializable{

	
	    /**
	    * @Fields serialVersionUID : TODO(��һ�仰�������������ʾʲô)
	    */
	    
	private static final long serialVersionUID = 12L;
	
	private String functionID;
	
	private String functionName;
	
	private String functiondescribe;
	
		
	    
	    /**
	     * ����һ���µ�ʵ�� UserFunction.
	     *
	     * @param functionID
	     * @param functionName
	     * @param functiondescribe
	     */
	    
	public UserFunction(String functionID, String functionName, String functiondescribe) {
		super();
		this.functionID = functionID;
		this.functionName = functionName;
		this.functiondescribe = functiondescribe;
	}


		/**
	     * ����һ���µ�ʵ�� UserFunction.
	     *
	     */
	    
	public UserFunction() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	* @return functionID
	*/
	
	public String getFunctionID() {
		return functionID;
	}

	
	/**
	 * @param functionID the functionID to set
	 */
	
	public void setFunctionID(String functionID) {
		this.functionID = functionID;
	}

	
	/**
	* @return functionName
	*/
	
	public String getFunctionName() {
		return functionName;
	}

	
	/**
	 * @param functionName the functionName to set
	 */
	
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	
	/**
	* @return functiondescribe
	*/
	
	public String getFunctiondescribe() {
		return functiondescribe;
	}

	
	/**
	 * @param functiondescribe the functiondescribe to set
	 */
	
	public void setFunctiondescribe(String functiondescribe) {
		this.functiondescribe = functiondescribe;
	}


	
	    /* (�� Javadoc)
	    * 
	    * 
	    * @return
	    * @see java.lang.Object#toString()
	    */
	    
	@Override
	public String toString() {
		return "UserFunction [functionID=" + functionID + ", functionName=" + functionName + ", functiondescribe="
				+ functiondescribe + "]";
	}
	
	

}

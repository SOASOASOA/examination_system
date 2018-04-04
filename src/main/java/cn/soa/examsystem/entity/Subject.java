
    /**  
    * @Title: Subject.java
    * @Package cn.soa.examsystem.entity
    * @Description: TODO(用一句话描述该文件做什么)
    * @author zhugang
    * @date 2018年4月1日
    * @version V1.0  
    */
    
package cn.soa.examsystem.entity;

import java.io.Serializable;
import java.util.Date;

/**
    * @ClassName: Subject
    * @Description: 试题科目实体咧
    * @author zhugang
    * @date 2018年4月1日
    *
    */

public class Subject implements Serializable{

	
	    /**
	    * @Fields serialVersionUID : 序列化
	    */
	    
	private static final long serialVersionUID = 118L;
	
	    /**
	    * @Fields id : 科目唯一标识
	    */
	    
	private String	id;
	
	    /**
	    * @Fields name : 科目名称
	    */
	    
	private String	name;
	
	    /**
	    * @Fields createTime : 科目创建时间
	    */
	    
	private Date createTime;
	
	    /**
	    * @Fields modifyTime : 科目修改时间
	    */
	    
	private Date	modifyTime;
	
	    /**
	    * @Fields state : 科目状态
	    */
	    
	private Integer	state;

		
	    /**
	     * 创建一个新的实例 Subject.
	     *
	     */
		    
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}


		
	    /**
	     * 创建一个新的实例 Subject.
	     *
	     * @param id
	     * @param name
	     * @param createTime
	     * @param modifyTime
	     * @param state
	     */
	    
	public Subject(String id, String name, Date createTime,
			Date modifyTime, Integer state) {
		super();
		this.id = id;
		this.name = name;
		this.createTime = createTime;
		this.modifyTime = modifyTime;
		this.state = state;
	}



	
	/**
	* @return id
	*/
	
	public String getId() {
		return id;
	}



	
	/**
	 * @param id the id to set
	 */
	
	public void setId(String id) {
		this.id = id;
	}



	
	/**
	* @return name
	*/
	
	public String getName() {
		return name;
	}



	
	/**
	 * @param name the name to set
	 */
	
	public void setName(String name) {
		this.name = name;
	}



	
	/**
	* @return createTime
	*/
	
	public Date getCreateTime() {
		return createTime;
	}



	
	/**
	 * @param createTime the createTime to set
	 */
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}



	
	/**
	* @return modifyTime
	*/
	
	public Date getModifyTime() {
		return modifyTime;
	}



	
	/**
	 * @param modifyTime the modifyTime to set
	 */
	
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}



	
	/**
	* @return state
	*/
	
	public Integer getState() {
		return state;
	}



	
	/**
	 * @param state the state to set
	 */
	
	public void setState(Integer state) {
		this.state = state;
	}



	
	    /* (非 Javadoc)
	    * 
	    * 
	    * @return
	    * @see java.lang.Object#toString()
	    */
	    
	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", createTime="
				+ createTime + ", modifyTime=" + modifyTime + ", state="
				+ state + "]";
	}


}

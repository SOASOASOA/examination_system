
    /**  
    * @Title: User.java
    * @Package cn.soa.examsystem.entity
    * @Description: TODO(用一句话描述该文件做什么)
    * @author zhugang
    * @date 2018年3月19日
    * @version V1.0  
    */
    
package cn.soa.examsystem.entity;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;


    /**
    * @ClassName: User
    * @Description: 用户信息
    * @author zhugang
    * @date 2018年3月21日
    *
    */
    
public class User implements Serializable{

	
	    /**
	    * @Fields serialVersionUID : 序列化使用
	    */
	    
	private static final long serialVersionUID = 11L;
	
	private String id;
	@NotNull(message = "{user.account}")
	private String account;
	
	private String password;
	
	private Date registTime;
	
	private Date modifyTime;
	
	private String name;
	
	private Integer sex;
	
	private String certificationNum;
	
	private String company;
	
	private Date birthday;
	
	private Integer state;
	
	private String note;
	
	private String phoneNum;

	private String email;
	
	
	
	    
	    /**
	     * 创建一个新的实例 User.
	     *
	     */
	    
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}




		/**
	     * 创建一个新的实例 User.
	     *
	     * @param id
	     * @param account
	     * @param password
	     * @param registTime
	     * @param modifyTime
	     * @param name
	     * @param sex
	     * @param certificationNum
	     * @param company
	     * @param birthday
	     * @param state
	     * @param note
	     * @param phoneNum
	     */
	    
	public User(String id, String account, String password, Date registTime, Date modifyTime, String name, Integer sex,
			String certificationNum, String company, Date birthday, Integer state, String note, String phoneNum, String email) {
		super();
		this.id = id;
		this.account = account;
		this.password = password;
		this.registTime = registTime;
		this.modifyTime = modifyTime;
		this.name = name;
		this.sex = sex;
		this.certificationNum = certificationNum;
		this.company = company;
		this.birthday = birthday;
		this.state = state;
		this.note = note;
		this.phoneNum = phoneNum;	
		this.email = email;
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
		* @return account
		*/
		
		public String getAccount() {
			return account;
		}



		
		/**
		 * @param account the account to set
		 */
		
		public void setAccount(String account) {
			this.account = account;
		}



		
		/**
		* @return password
		*/
		
		public String getPassword() {
			return password;
		}



		
		/**
		 * @param password the password to set
		 */
		
		public void setPassword(String password) {
			this.password = password;
		}



		
		/**
		* @return registTime
		*/
		
		public Date getRegistTime() {
			return registTime;
		}



		
		/**
		 * @param registTime the registTime to set
		 */
		
		public void setRegistTime(Date registTime) {
			this.registTime = registTime;
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
		* @return sex
		*/
		
		public Integer getSex() {
			return sex;
		}



		
		/**
		 * @param sex the sex to set
		 */
		
		public void setSex(Integer sex) {
			this.sex = sex;
		}



		
		/**
		* @return certificationNum
		*/
		
		public String getCertificationNum() {
			return certificationNum;
		}



		
		/**
		 * @param certificationNum the certificationNum to set
		 */
		
		public void setCertificationNum(String certificationNum) {
			this.certificationNum = certificationNum;
		}



		
		/**
		* @return company
		*/
		
		public String getCompany() {
			return company;
		}



		
		/**
		 * @param company the company to set
		 */
		
		public void setCompany(String company) {
			this.company = company;
		}



		
		/**
		* @return birthday
		*/
		
		public Date getBirthday() {
			return birthday;
		}



		
		/**
		 * @param birthday the birthday to set
		 */
		
		public void setBirthday(Date birthday) {
			this.birthday = birthday;
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



		
		/**
		* @return note
		*/
		
		public String getNote() {
			return note;
		}



		
		/**
		 * @param note the note to set
		 */
		
		public void setNote(String note) {
			this.note = note;
		}



		
		/**
		* @return phoneNum
		*/
		
		public String getPhoneNum() {
			return phoneNum;
		}



		
		/**
		 * @param phoneNum the phoneNum to set
		 */
		
		public void setPhoneNum(String phoneNum) {
			this.phoneNum = phoneNum;
		}



		
		/**
		* @return email
		*/
		
		public String getEmail() {
			return email;
		}



		
		/**
		 * @param email the email to set
		 */
		
		public void setEmail(String email) {
			this.email = email;
		}




		
		    /* (非 Javadoc)
		    * 
		    * 
		    * @return
		    * @see java.lang.Object#toString()
		    */
		    
		@Override
		public String toString() {
			return "User [id=" + id + ", account=" + account + ", password=" + password + ", registTime=" + registTime
					+ ", modifyTime=" + modifyTime + ", name=" + name + ", sex=" + sex + ", certificationNum="
					+ certificationNum + ", company=" + company + ", birthday=" + birthday + ", state=" + state
					+ ", note=" + note + ", phoneNum=" + phoneNum + ", email=" + email + "]";
		}	
	
	
}

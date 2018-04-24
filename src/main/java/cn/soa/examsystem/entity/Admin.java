package cn.soa.examsystem.entity;

import java.io.Serializable;
/**
 * 用户实体类对应表user_info
 * @author hezy
 *
 */
public class Admin implements Serializable {

	private static final long serialVersionUID = 7524736911299422565L;
	//用户ID
	private String user_id;
	//用户登录账号
	private String user_account;
	//用户密码
	private String user_password;
	//用户注册时间
	private String user_regist_time;
	//用户修改时间
	private String user_modify_time;
	//用户姓名
	private String user_name;
	//用户性别
	private String user_sex;
	//用户证件号
	private String user_certificaiton_num;
	//用户单位
	private String user_company;
	//用户email
	private String user_email;
	//用户出生日期
	private String user_birthdate;
	//用户账号状态
	private String user_account_state;
	//备用字段
	private String user_note;
	//用户联系方式
	private String user_phone_num;
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_account() {
		return user_account;
	}
	public void setUser_account(String user_account) {
		this.user_account = user_account;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_regist_time() {
		return user_regist_time;
	}
	public void setUser_regist_time(String user_regist_time) {
		this.user_regist_time = user_regist_time;
	}
	public String getUser_modify_time() {
		return user_modify_time;
	}
	public void setUser_modify_time(String user_modify_time) {
		this.user_modify_time = user_modify_time;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_sex() {
		return user_sex;
	}
	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}
	public String getUser_certificaiton_num() {
		return user_certificaiton_num;
	}
	public void setUser_certificaiton_num(String user_certificaiton_num) {
		this.user_certificaiton_num = user_certificaiton_num;
	}
	public String getUser_company() {
		return user_company;
	}
	public void setUser_company(String user_company) {
		this.user_company = user_company;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_birthdate() {
		return user_birthdate;
	}
	public void setUser_birthdate(String user_birthdate) {
		this.user_birthdate = user_birthdate;
	}
	public String getUser_account_state() {
		return user_account_state;
	}
	public void setUser_account_state(String user_account_state) {
		this.user_account_state = user_account_state;
	}
	public String getUser_note() {
		return user_note;
	}
	public void setUser_note(String user_note) {
		this.user_note = user_note;
	}
	public String getUser_phone_num() {
		return user_phone_num;
	}
	public void setUser_phone_num(String user_phone_num) {
		this.user_phone_num = user_phone_num;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((user_account == null) ? 0 : user_account.hashCode());
		result = prime * result + ((user_account_state == null) ? 0 : user_account_state.hashCode());
		result = prime * result + ((user_birthdate == null) ? 0 : user_birthdate.hashCode());
		result = prime * result + ((user_certificaiton_num == null) ? 0 : user_certificaiton_num.hashCode());
		result = prime * result + ((user_company == null) ? 0 : user_company.hashCode());
		result = prime * result + ((user_email == null) ? 0 : user_email.hashCode());
		result = prime * result + ((user_id == null) ? 0 : user_id.hashCode());
		result = prime * result + ((user_modify_time == null) ? 0 : user_modify_time.hashCode());
		result = prime * result + ((user_name == null) ? 0 : user_name.hashCode());
		result = prime * result + ((user_note == null) ? 0 : user_note.hashCode());
		result = prime * result + ((user_password == null) ? 0 : user_password.hashCode());
		result = prime * result + ((user_phone_num == null) ? 0 : user_phone_num.hashCode());
		result = prime * result + ((user_regist_time == null) ? 0 : user_regist_time.hashCode());
		result = prime * result + ((user_sex == null) ? 0 : user_sex.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		if (user_account == null) {
			if (other.user_account != null)
				return false;
		} else if (!user_account.equals(other.user_account))
			return false;
		if (user_account_state == null) {
			if (other.user_account_state != null)
				return false;
		} else if (!user_account_state.equals(other.user_account_state))
			return false;
		if (user_birthdate == null) {
			if (other.user_birthdate != null)
				return false;
		} else if (!user_birthdate.equals(other.user_birthdate))
			return false;
		if (user_certificaiton_num == null) {
			if (other.user_certificaiton_num != null)
				return false;
		} else if (!user_certificaiton_num.equals(other.user_certificaiton_num))
			return false;
		if (user_company == null) {
			if (other.user_company != null)
				return false;
		} else if (!user_company.equals(other.user_company))
			return false;
		if (user_email == null) {
			if (other.user_email != null)
				return false;
		} else if (!user_email.equals(other.user_email))
			return false;
		if (user_id == null) {
			if (other.user_id != null)
				return false;
		} else if (!user_id.equals(other.user_id))
			return false;
		if (user_modify_time == null) {
			if (other.user_modify_time != null)
				return false;
		} else if (!user_modify_time.equals(other.user_modify_time))
			return false;
		if (user_name == null) {
			if (other.user_name != null)
				return false;
		} else if (!user_name.equals(other.user_name))
			return false;
		if (user_note == null) {
			if (other.user_note != null)
				return false;
		} else if (!user_note.equals(other.user_note))
			return false;
		if (user_password == null) {
			if (other.user_password != null)
				return false;
		} else if (!user_password.equals(other.user_password))
			return false;
		if (user_phone_num == null) {
			if (other.user_phone_num != null)
				return false;
		} else if (!user_phone_num.equals(other.user_phone_num))
			return false;
		if (user_regist_time == null) {
			if (other.user_regist_time != null)
				return false;
		} else if (!user_regist_time.equals(other.user_regist_time))
			return false;
		if (user_sex == null) {
			if (other.user_sex != null)
				return false;
		} else if (!user_sex.equals(other.user_sex))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Admin [user_id=" + user_id + ", user_account=" + user_account + ", user_password=" + user_password
				+ ", user_regist_time=" + user_regist_time + ", user_modify_time=" + user_modify_time + ", user_name="
				+ user_name + ", user_sex=" + user_sex + ", user_certificaiton_num=" + user_certificaiton_num
				+ ", user_company=" + user_company + ", user_email=" + user_email + ", user_birthdate=" + user_birthdate
				+ ", user_account_state=" + user_account_state + ", user_note=" + user_note + ", user_phone_num="
				+ user_phone_num + "]";
	}
}

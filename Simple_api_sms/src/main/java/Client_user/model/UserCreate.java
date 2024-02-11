package Client_user.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserCreate {
	
	@Id
	private int userid;
	private String name;
	private String email;
	private String phone;
	private String date;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "UserCreate [userid=" + userid + ", name=" + name + ", email=" + email + ", phone=" + phone + ", date="
				+ date + "]";
	}
	public UserCreate(int userid, String name, String email, String phone, String date) {
		super();
		this.userid = userid;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.date = date;
	}
	public UserCreate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}

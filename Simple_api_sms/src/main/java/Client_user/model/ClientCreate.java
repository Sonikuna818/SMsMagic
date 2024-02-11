package Client_user.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClientCreate {

	@Id
	private int clientid;
	private String name;
	private String email;
	private String phone;
	private String user;
	private String company;
	public int getClientid() {
		return clientid;
	}
	public void setClientid(int clientid) {
		this.clientid = clientid;
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
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "ClientCreate [Clientid=" + clientid + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", user=" + user + ", company=" + company + "]";
	}
	public ClientCreate(int clientid, String name, String email, String phone, String user, String company) {
		super();
		this.clientid = clientid;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.user = user;
		this.company = company;
	}
	public ClientCreate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}

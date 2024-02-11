package Client_user.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CompanyCreate {

	
	@Id
	private int companyid;
	private String name;
	private String email;
	private long size;
	public int getCompanyid() {
		return companyid;
	}
	public void setCompanyid(int companyid) {
		this.companyid = companyid;
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
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "CompanyCreate [companyid=" + companyid + ", name=" + name + ", email=" + email + ", size=" + size + "]";
	}
	public CompanyCreate(int companyid, String name, String email, long size) {
		super();
		this.companyid = companyid;
		this.name = name;
		this.email = email;
		this.size = size;
	}
	public CompanyCreate() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	
}

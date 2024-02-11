package Client_user.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import Client_user.model.CompanyCreate;
import Client_user.model.UserCreate;

@Component
public class UserCreateDao{
	
	@Autowired
	private HibernateTemplate hibernatetemplate;
	
	@Transactional
	public void createuser(UserCreate usercreate) {
		
		this.hibernatetemplate.saveOrUpdate(usercreate);
	}
	
	public List<UserCreate> getallUser(){
		 List<UserCreate> usercreate= this.hibernatetemplate.loadAll(UserCreate.class);
		 return usercreate;
	}


	
	@Transactional
	public void deleteUser(int userid) {
		UserCreate usercreate= this.hibernatetemplate.load(UserCreate.class, userid);
		this.hibernatetemplate.delete(usercreate);
	}
	
	public UserCreate getOneUser(int userid) {
		return this.hibernatetemplate.get(UserCreate.class, userid);
	}
	
	
}

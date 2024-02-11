package Client_user.dao;




import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import Client_user.model.CompanyCreate;
import Client_user.model.UserCreate;


@Component
public class CompanyCreateDao {
	
	@Autowired
	private HibernateTemplate hibernatetemplate;
	
	@Transactional
	public void CreateCompany(CompanyCreate companycreate) {
		
		this.hibernatetemplate.saveOrUpdate(companycreate);
		
	}
	
	
	public List<CompanyCreate> getAllcompany(){
		List<CompanyCreate> companycreate= this.hibernatetemplate.loadAll(CompanyCreate.class);
		return companycreate;
	}
	
	
	@Transactional
	public void deletecompany(int companyid) {
		CompanyCreate companycreate= this.hibernatetemplate.load(CompanyCreate.class, companyid);
		this.hibernatetemplate.delete(companycreate);
	}
	
	public CompanyCreate getOneCompany(int companyid) {
		return this.hibernatetemplate.get(CompanyCreate.class, companyid);
	}
      
}

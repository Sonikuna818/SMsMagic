package Client_user.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import Client_user.model.ClientCreate;
import Client_user.model.UserCreate;

@Component
public class ClientDao {

	@Autowired
	private HibernateTemplate hibernatetemplate;
	
	@Transactional
	public void addclient(ClientCreate clientcreate) {
		this.hibernatetemplate.saveOrUpdate(clientcreate);
	}
	
	public List<ClientCreate> getAllClient(){
		
		List<ClientCreate> clientcreate= this.hibernatetemplate.loadAll(ClientCreate.class);
		return clientcreate;
		
	}
	
	@Transactional
	public void deleteClient(int clientid) {
		ClientCreate clientcreate= this.hibernatetemplate.load(ClientCreate.class, clientid);
		this.hibernatetemplate.delete(clientcreate);
	}
	
	public ClientCreate getOneClient(int clientid) {
		return this.hibernatetemplate.get(ClientCreate.class, clientid);
	}
	
}

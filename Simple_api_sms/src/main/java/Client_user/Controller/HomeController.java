package Client_user.Controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;
import Client_user.dao.ClientDao;
import Client_user.dao.CompanyCreateDao;
import Client_user.model.ClientCreate;
import Client_user.model.CompanyCreate;
import Client_user.model.UserCreate;

@Controller
public class HomeController {
	
	@Autowired
	private Client_user.dao.UserCreateDao UserCreateDao;
	
	@Autowired
	private CompanyCreateDao companycreatedao;
	
	@Autowired
	private ClientDao clientdao;
	
	@RequestMapping("/")
	public String Homecontroller(Model m) {
		
		List<UserCreate> usercreate= UserCreateDao.getallUser();
		m.addAttribute("usercreate", usercreate);
		return "index";
	}
//	
//	@RequestMapping("/userupdate22")
//	public String userupdate() {
//		return "updateuser";
//	}
	
	
	@RequestMapping("/Usearch")
	public String UserSearch() {
		
		return "UserSearch";
	}
	
	@RequestMapping("/UCreation")
	public String UserCreation() {
		
		return "UserCreation";
	}
	
	@RequestMapping("/CCreation")
	public String ClientCreation() {
		
		return "ClientCreation";
	}
	
	@RequestMapping("/Companies")
	public String Companies() {
		
		return "Companies";
	}
	
	
	@RequestMapping("/userprofile")
	public String Userprofile(Model m) {
		
		List<UserCreate> usercreate= UserCreateDao.getallUser();
		m.addAttribute("usercreate", usercreate);
		return "UserDetails";
	}
	
	
	@RequestMapping("/companyprofile1")
	public String Companyprofile(Model m) {
		
		List<CompanyCreate> companycreate= companycreatedao.getAllcompany();
		m.addAttribute("companycreate", companycreate);
		return "companyprofile";
	}
	
	@RequestMapping("/clientprofile1")
	public String ClientProfile(Model m) {
		List<ClientCreate> clientcreate= clientdao.getAllClient();
		m.addAttribute("clientcreate", clientcreate);
		return "clientprofile";
	}
	
	
	// Handling_Usercreation Form
	
	@RequestMapping(value = "/add-users", method= RequestMethod.POST)
	public RedirectView handleuser(@ModelAttribute UserCreate usercreate, HttpServletRequest request) {
		
		System.out.println(usercreate);
		UserCreateDao.createuser(usercreate);
		RedirectView redirectview= new RedirectView();
		redirectview.setUrl(request.getContextPath()+"/UCreation");
		return redirectview;
	}
	
	
	// Handling Company Form
	
	@RequestMapping(value="/add-companies", method = RequestMethod.POST)
	public RedirectView handleCompanies(@ModelAttribute CompanyCreate companycreate, HttpServletRequest request) {
		
		System.out.println(companycreate);
		companycreatedao.CreateCompany(companycreate);
		RedirectView redirectview= new RedirectView();
		redirectview.setUrl(request.getContextPath()+"/Companies");
		return redirectview;
		
	}
	
	
	//Handling Client Form
	
	@RequestMapping(value="/client-add", method = RequestMethod.POST)
	public RedirectView handleclient(@ModelAttribute ClientCreate clientcreate, HttpServletRequest request) {
		System.out.println(clientcreate);
		clientdao.addclient(clientcreate);
		RedirectView redirectview= new RedirectView();
		redirectview.setUrl(request.getContextPath()+"/CCreation");
		return redirectview;
		
	}
	
	
	//delete the data user
	@RequestMapping("/delete/{userid}")
	public RedirectView deleteUser(@PathVariable("userid") int userid, HttpServletRequest request) {
		
		this.UserCreateDao.deleteUser(userid);
		RedirectView redirectview=  new RedirectView();
		redirectview.setUrl(request.getContextPath()+"/userprofile");
		return redirectview;
		
	}
	
	// delete the data Client
	//clientid

	@RequestMapping("/delete1/{clientid}")
	public RedirectView deleteclient(@PathVariable("clientid") int clientid, HttpServletRequest request) {
		
		this.clientdao.deleteClient(clientid);
		RedirectView redirectview=  new RedirectView();
		redirectview.setUrl(request.getContextPath()+"/clientprofile1");
		return redirectview;
		
	}
	
	
	// delete the company data
	@RequestMapping("/delete2/{companyid}")
	public RedirectView deletecompany(@PathVariable("companyid") int companyid, HttpServletRequest request) {
		
		this.companycreatedao.deletecompany(companyid);
		RedirectView redirectview=  new RedirectView();
		redirectview.setUrl(request.getContextPath()+"/companyprofile1");
		return redirectview;
		
	}
	
	
	
	//Update USer
	@RequestMapping("/update/{userid}")
	public String updateuser(@PathVariable("userid") int userid, Model m) {
		
		UserCreate usercreate= this.UserCreateDao.getOneUser(userid);
		m.addAttribute("usercreate", usercreate);
		return "updateuser";
		
	}
	
	//update company
	
	@RequestMapping("/update1/{companyid}")
	public String updatecompany(@PathVariable("companyid") int companyid, Model m) {
		
		CompanyCreate companycreate= this.companycreatedao.getOneCompany(companyid);
		m.addAttribute("companycreate", companycreate);
		return "companyupdate";
		
	}
	
	//update Client
	//clientid
	  @RequestMapping("/update2/{clientid}")
      public String updateclient(@PathVariable("clientid") int clientid, Model m) {
		
		ClientCreate clientcreate= this.clientdao.getOneClient(clientid);
		m.addAttribute("clientcreate", clientcreate);
		return "updateclient";
		
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String SearchUser(Model m) {
		
		List<UserCreate> usercreate= UserCreateDao.getallUser();
		m.addAttribute("usercreate", usercreate);
		return "UserSearch";
	}
	
}

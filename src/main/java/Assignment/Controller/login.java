package Assignment.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Assignment.Repository.accountsRepository;
import Assignment.Util.EncryptUtil;
import Assignment.entitis.Account;

@Controller
public class login {
 @Autowired
 private accountsRepository accRepo;
 @Autowired 
 HttpServletRequest request;
 @GetMapping("login")
 public String login(@ModelAttribute("account") Account account,Model mo) {
	 mo.addAttribute("view","/views/login.jsp");
	 return "layout";	 
 }
 @PostMapping("login")
 public String login2(
		 @RequestParam("email") String email,
		 @RequestParam("password") String password
		 ) {
	 HttpSession session=request.getSession();
	 Account acc=this.accRepo.findByEmail(email);
	 boolean check=EncryptUtil.verify(password, acc.getPassword());
	 if(!check) {
		 System.out.println("Sai email hoac password");
		 return "redirect:/login";
	 }
	 else {
		 System.out.println(acc.getEmail());
		 System.out.println(acc.getPassword());
		 session.setAttribute("account", acc);
		 return "redirect:/admin/accounts/index";
	}
	
 }
}

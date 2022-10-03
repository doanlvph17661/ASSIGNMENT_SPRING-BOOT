package Assignment.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import Assignment.Repository.accountsRepository;
import Assignment.Repository.productRepositori;
import Assignment.entitis.Account;
import Assignment.entitis.Product;
import net.bytebuddy.asm.Advice.Return;

@Controller
public class homeController {
	@Autowired
	productRepositori pro;
	@Autowired
	HttpServletRequest res;
	@Autowired
	accountsRepository accRepo;
    @GetMapping("/index")
  public String index(@ModelAttribute("product") Product product,Model mo,@ModelAttribute("account")Account acount) {
	 List<Product> data=this.pro.findAll();
 HttpSession session=res.getSession();
	 Account acc=(Account) session.getAttribute("account");
	  mo.addAttribute("account",acc);
	 mo.addAttribute("product", data);
	 mo.addAttribute("view", "/views/index.jsp");
	  return "/layout";
	  }
 @GetMapping("detail/{id}")
 public String detail( Product product,Model mo,@PathVariable("id")Integer id) {
	 product=this.pro.getOne(id);
	 mo.addAttribute("product",product);
	 mo.addAttribute("view","/views/detail.jsp" );
	 return "layout";
 }

}

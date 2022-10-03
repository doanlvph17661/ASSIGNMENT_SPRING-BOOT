package Assignment.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ÁA {
      @GetMapping("layout")
      public String layout(Model mo) {
//    	  mo.addAttribute("view","/views/admin/accounts/index.jsp");
    	  return "layout1";
    	  
      }
      
}

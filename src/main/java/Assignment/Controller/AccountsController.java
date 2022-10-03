package Assignment.Controller;

import java.io.File;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import Assignment.Repository.accountsRepository;
import Assignment.Util.EncryptUtil;
import Assignment.Util.UploadFileUtils;
import Assignment.entitis.Account;

@Controller
@RequestMapping("/admin/accounts")
public class AccountsController {
     @Autowired
     private accountsRepository acountRepo;
     @Autowired
     UploadFileUtils up;
     
    
     @RequestMapping("index")
     public String index(@ModelAttribute("account") Account acc,Model mo) {
    	
    	 List<Account> data=this.acountRepo.findAll();
    	 mo.addAttribute("data",data);
         mo.addAttribute("view","/views/admin/accounts/index.jsp");
    	 return "layout";
    	 
     }
     @GetMapping("create")
     public String create(@ModelAttribute("account") Account acc,Model mo)
     { 
    	 mo.addAttribute("view","/views/admin/accounts/create.jsp");
    	 return "layout";
     }
     
     @PostMapping("store")     
     public String store(@ModelAttribute("account") Account acc,Model mo,@RequestParam("upload") MultipartFile upload) {
    
          this.up.handleUpLoadFile(upload);
    	 acc.setPhoto(upload.getOriginalFilename());
    	
         String password=EncryptUtil.hash(acc.getPassword());
         acc.setPassword(password);
    	 this.acountRepo.save(acc); 
    	 
    	 mo.addAttribute("data",acc);	
    	 return "redirect:/admin/accounts/index";
     }
     @GetMapping("edit/{id}")
     public String edit(@ModelAttribute("account") Account acc,@PathVariable("id") Integer id,Model mo,@RequestParam("upload") MultipartFile upload) {
    	 acc=this.acountRepo.getOne(id);
 
    	 mo.addAttribute("account",acc);
    	 mo.addAttribute("view","/views/admin/accounts/edit.jsp");
    	 return "layout";
     }
     
     @PostMapping("update/{id}")
     public String update(@PathVariable("id") Integer id,@ModelAttribute("account")Account acc) {
    	 Account ac=this.acountRepo.getOne(id);
    	 acc.setPassword(ac.getPassword());
    	 acc.setId(id);
    	 this.acountRepo.save(acc);
    	 return "redirect:/admin/accounts/index";
     }
     @GetMapping("delete/{id}")
     public String delete(@PathVariable("id") Integer id,@ModelAttribute("account") Account acc) {

    	 this.acountRepo.delete(acc);
    	 return "redirect:/admin/accounts/index";
     }
}

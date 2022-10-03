package Assignment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Assignment.Repository.categoryRepository;
import Assignment.entitis.Account;
import Assignment.entitis.Category;

@Controller
@RequestMapping("/admin/categories")
public class categoryController {
      @Autowired
      private categoryRepository categoryRepo;
      
      @RequestMapping("index")
      public String index(@ModelAttribute("category") Category acc,Model mo) {
     	 List<Category> data=this.categoryRepo.findAll();
     	 mo.addAttribute("data",data);
     	 mo.addAttribute("view","/views/admin/categories/index.jsp");
     	 return "layout";     	 
      }
      @GetMapping("create")
      public String create(@ModelAttribute("category") Category acc,Model mo)
      { 
    	  mo.addAttribute("view","/views/admin/categories/create.jsp");
     	 return "layout";
      }
      @PostMapping("store")
      public String store(@ModelAttribute("category") Category acc,Model mo) {
          
     	 this.categoryRepo.save(acc); 
     	
     	 return "redirect:/admin/categories/index";
      }
      @GetMapping("edit/{id}")
      public String edit(@ModelAttribute("category") Category acc,@PathVariable("id") Integer id,Model mo) {
     	 acc=this.categoryRepo.getOne(id);
     	 mo.addAttribute("category",acc);
     	 mo.addAttribute("view","/views/admin/categories/edit.jsp");
     	 return "layout";
     	 
      }
      
      @PostMapping("update/{id}")
      public String update(@PathVariable("id") Integer id,@ModelAttribute("category") Category acc) {
     	 acc.setId(id);
     	 this.categoryRepo.save(acc);
     	 return "redirect:/admin/categories/index";
      }
      @GetMapping("delete/{id}")
      public String delete(@PathVariable("id") Integer id,@ModelAttribute("category") Category acc) {

     	 this.categoryRepo.delete(acc);
     	 return "redirect:/admin/categories/index"; 
      }
}

package Assignment.Controller;

import java.util.Date;
import java.util.List;

import org.apache.catalina.filters.ExpiresFilter.XServletOutputStream;
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
import Assignment.Repository.categoryRepository;
import Assignment.Repository.productRepositori;
import Assignment.Util.UploadFileUtils;
import Assignment.entitis.Category;
import Assignment.entitis.Product;

@Controller
@RequestMapping("admin/products")
public class ProductController {
	@Autowired
	private categoryRepository cateRepo;
	@Autowired
	private productRepositori productRepo;
	@Autowired
	private UploadFileUtils up;
	@Autowired
	private accountsRepository accountRepo;
	@GetMapping("index")
	public String index(@ModelAttribute("product") Product product,Model mo) {
		List<Product> data=this.productRepo.findAll();
		mo.addAttribute("product", data);
		mo.addAttribute("view","/views/admin/products/index.jsp");
		return "layout";
	}
	@GetMapping("create")
	public String create(@ModelAttribute("product")Product product,Model mo) {
		List<Category>data=this.cateRepo.findAll();
		mo.addAttribute("view","/views/admin/products/create.jsp");
		mo.addAttribute("data", data);
		return "layout";
	}
	
	@PostMapping("store")
	public String store(@ModelAttribute("product") Product product,Model model,@RequestParam("cate_id") Integer cate_id,@RequestParam("upload1") MultipartFile upload)
	{
		Category cate=this.cateRepo.getOne(cate_id);
	   	 this.up.handleUpLoadFile(upload);
    	 product.setImage(upload.getOriginalFilename());
    	 System.out.println("Tiến bịp: "+upload.getOriginalFilename());
	
	   product.setCreatedDate(new Date());
		product.setCategory(cate);
		
	   System.out.println("------------------------"+cate_id);
		this.productRepo.save(product);
		return "redirect:/admin/products/index";
	}
	@GetMapping("edit/{id}")
	public String edit(@ModelAttribute("product") Product product,@PathVariable("id") Integer id,Model mo) {
		product=this.productRepo.getOne(id);
		mo.addAttribute("product",product);
		mo.addAttribute("view","/views/admin/products/edit.jsp");
		return "layout";
	}
	@PostMapping("update/{id}")
	public String update(@ModelAttribute("product") Product product,@PathVariable("id") Integer id) {
	      Product pro=this.productRepo.getOne(id);
	      product.setId(id);
	     product.setCategory(pro.getCategory());
	     product.setCreatedDate(pro.getCreatedDate());
	      System.out.println("---------------------------------name"+product.getName());
		this.productRepo.save(product);
		return "redirect:/admin/products/index";
	}
	 @GetMapping("delete/{id}")
     public String delete(@PathVariable("id") Integer id,@ModelAttribute("product") Product product) {
      product=this.productRepo.getOne(id);
      System.out.println("-----------------------------Xóa thành công: "+id);
    	 this.productRepo.delete(product);
    	 return "redirect:/admin/products/index"; 
     }
}

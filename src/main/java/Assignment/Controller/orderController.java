package Assignment.Controller;

import java.util.Date;
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

import Assignment.Repository.accountsRepository;
import Assignment.Repository.oderRepository;
import Assignment.Repository.orderDetailRepositori;
import Assignment.Repository.productRepositori;
import Assignment.entitis.Account;
import Assignment.entitis.Order;
import Assignment.entitis.OrderDetail;
import Assignment.entitis.Product;

@Controller

public class orderController {
	@Autowired
	private oderRepository orderRepo;
	@Autowired 
	private accountsRepository accRepo;
	@Autowired
	productRepositori productRepo;
	@Autowired
	HttpServletRequest resquest;
	@Autowired
	orderDetailRepositori repo;
    @GetMapping("order1/{price}/{id}")
    public String order1(	Order order,
    	    OrderDetail orderDetail,
    	    @PathVariable("price") Double price,
    	    @PathVariable("id") Integer id,
    	    @RequestParam("name") String fullname,
    	    @RequestParam("address") String address,
    	    @RequestParam("sdt")  Integer sdt,
    	    @RequestParam("quantity") Integer quantity
    	    ) {
    	System.out.println(price+" "+" "+id+" "+fullname+" "+address+" "+sdt+" "+quantity );
    HttpSession session=resquest.getSession();
    Account account=(Account) session.getAttribute("account");
    if(account!=null) {
    	order.setAddress(address);
    	order.setCreateDate(new Date());
    	order.setFullname(fullname);
    	order.setSdt(sdt);
    	order.setUser(account);
    	order.setTotal(quantity*price);
    	this.orderRepo.save(order);
    	List<Order> listOrder=this.orderRepo.findByEmail(account.getEmail());
          orderDetail.setOrder(listOrder.get(listOrder.size()-1));
          orderDetail.setQuantity(quantity);
          Product product=this.productRepo.getOne(id);
          orderDetail.setProduct(product);
          orderDetail.setPrice(quantity*price);
          this.repo.save(orderDetail);
          return"redirect:/index";
    }
      else {
    	  System.out.println("banj chua dang nhap");
		return "redirect:/index";
	}

    }
    @GetMapping("admin/orders/index")
    public String index(Model mo) {
    	List<Order> o=this.orderRepo.findAll();
    	mo.addAttribute("order",o);
    	mo.addAttribute("view","/views/admin/orders/index.jsp");
    	return "layout";
    	
    }
    @GetMapping("admin/orderDetail/index")
    public String index2(Model mo) {
    	List<OrderDetail> o=this.repo.findAll();
    	
    	mo.addAttribute("order",o);
    	mo.addAttribute("view","/views/admin/orderDetail/index.jsp");
    	return "layout";
    }
}

package Assignment.Controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Assignment.Repository.CartRepository;
import Assignment.Repository.oderRepository;
import Assignment.Repository.orderDetailRepositori;
import Assignment.Repository.productRepositori;
import Assignment.entitis.*;

@Controller
public class OrderDetailControler {
	
	
	@Autowired
	private productRepositori proRepo;
	
	@Autowired
	private CartRepository cartRepo;
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private orderDetailRepositori orderDetailrepo;
	
	@Autowired
	private oderRepository orderREPO;                                  

	@RequestMapping("sp/card")
	public String cart(Model model) {
		HttpSession session=request.getSession();
		Account account=(Account)session.getAttribute("account");
		System.out.println("account:"+account.getId());
		List<cart>list=this.cartRepo.findAllCartByAccountId(account.getId());
		for (cart cart : list) {
			System.out.println("--------- san pham dc lay ra ------------");
			System.out.println(cart.getPrice());
		}
		model.addAttribute("list", list);
		System.out.println("----- vao trong roi ------------");
		model.addAttribute("view","/views/cart.jsp");		
		return "layout";
	}	
 
	@PostMapping("orderDetail/createCart/{id}")
	public String Createcart(
			@PathVariable("id")Integer id,
			@RequestParam("soLuong")Integer quantity,
			cart cart
			) {
		HttpSession session=request.getSession();
		Account account=(Account)session.getAttribute("account");
		Product pro=this.proRepo.getOne(id);
		cart.setPrice(pro.getPrice()*quantity);
		cart.setProduct(pro);
		cart.setQuanty(quantity);
		cart.setAccount(account);
		this.cartRepo.save(cart);
		
		return "redirect:/sp/card";
	}
	
	@RequestMapping("order")
	private String order(Model model) {
		HttpSession session=request.getSession();
		Account account=(Account)session.getAttribute("account");
		model.addAttribute("account", account);
		
		model.addAttribute("view", "/views/order.jsp");
		return "layout";
	}
	
	@PostMapping("orderStore")
	public String orderStore(
			@RequestParam("fullname")String fullname,
			@RequestParam("address")String address,
			@RequestParam("sdt")Integer sdt
			) {
		HttpSession session=request.getSession();
		Account account=(Account)session.getAttribute("account");
		
		Order order=new Order();
		order.setAddress(address);
		order.setCreateDate(new Date());
		order.setFullname(fullname);
		order.setSdt(sdt);
		order.setUser(account);
		order.setTotal(0);
		this.orderREPO.save(order);
		double tong=0;
		List<cart>list=this.cartRepo.findAllCartByAccountId(account.getId());
		OrderDetail orderdetail=new OrderDetail();
		for (cart cart : list) {
			orderdetail.setOrder(order);
			orderdetail.setProduct(cart.getProduct());
			orderdetail.setQuantity(cart.getQuanty());
			
			orderdetail.setPrice(cart.getPrice());
			tong+=cart.getPrice();
			this.orderDetailrepo.save(orderdetail);
			orderdetail=new OrderDetail();
			this.cartRepo.delete(cart);
		}
	order.setTotal(tong);
	this.orderREPO.save(order);
		System.out.println("------------ tong:"+tong);
		
		return "redirect:/order";
	}
}


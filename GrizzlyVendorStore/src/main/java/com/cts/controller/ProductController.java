package com.cts.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.entity.Product;
import com.cts.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService bs;

	@GetMapping("/list")			//Getting the List of all Products
	public String listAllBooks(Model model) {

		
	
		List<Product> lb = bs.listallProducts();
		model.addAttribute("product", lb);

		return "productList";
	}
	
	
	@GetMapping("/showForm")
	public String showAddProduct(Model model) {

	
		Product theproduct = new Product();
		
		model.addAttribute("product", theproduct);

		return "addProduct";
	}
	
	
	@PostMapping("/saveBook")
	public String saveAProduct(@ModelAttribute("product") Product theProduct)
	{
		System.out.println("Hello  saveBook");
		bs.saveProduct(theProduct);
		return "redirect:/product/list";
		
		
	}
	
	@GetMapping("/updateForm")
	public  String showFormUpdate(@RequestParam("id") int theId,Model theModel)
	{
		
		Product  book =bs.getProduct(theId);
		theModel.addAttribute("book",book);
		return "addProduct";
		
	}
	
	
	@GetMapping("/deleteForm")
	public String deleteBook(@RequestParam("id") int Id)
	{
		bs.deleteProduct(Id);
		return "redirect:/product/list";
	}
	
	@GetMapping("/viewForm")
	public String viewProductDesc(@RequestParam("id") int Id,Model theModel)
	{
		Product  book =bs.getProduct(Id);
		theModel.addAttribute("book",book);
		return "viewDesc";
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)  
    public String logoutPage(HttpServletRequest request, HttpServletResponse response) {  
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();  
        if (auth != null){      
           new SecurityContextLogoutHandler().logout(request, response, auth);  
        }  
         return "redirect:/";  
     }  
}

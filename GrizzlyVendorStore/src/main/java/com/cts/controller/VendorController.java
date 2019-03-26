package com.cts.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
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
import com.cts.entity.Vendor;
import com.cts.service.VendorService;


@Controller
@RequestMapping("/vendor")
public class VendorController {

	@Autowired
	VendorService bs;


	
	@GetMapping("/vendorlist")
	public String listAllVendor(Model model) {

		
	
		List<Vendor> lb = bs.listallVendors();
		model.addAttribute("vendor", lb);
	
		return "vendorList";
	}


	@GetMapping("/viewVendorProducts")
	public String viewVendorProducts(@RequestParam("id") int Id,Model theModel)
	{
		System.out.println(Id);
		Vendor  vendor =bs.getVendor(Id);
		System.out.println(vendor);
		theModel.addAttribute("vendor",vendor);
		return "viewVendorProduct";
	
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

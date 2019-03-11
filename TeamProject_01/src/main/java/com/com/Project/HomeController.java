package com.com.Project;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "testHome";
	}
	
	@RequestMapping(value = "/test404", method = RequestMethod.GET)
	public String test404() {
		return "404";
	}
	
	@RequestMapping(value = "/account", method = RequestMethod.GET)
	public String account() {
		return "account";
	}
	
	@RequestMapping(value = "/blog-archive-2", method = RequestMethod.GET)
	public String blogArchive2() {
		return "blog-archive-2";
	}
	
	@RequestMapping(value = "/blog-archive", method = RequestMethod.GET)
	public String blogArchive() {
		return "blog-archive";
	}
	
	@RequestMapping(value = "/blog-single", method = RequestMethod.GET)
	public String blogSingle() {
		return "blog-single";
	}
	
	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public String cart() {
		return "cart";
	}
	
	@RequestMapping(value = "/checkout", method = RequestMethod.GET)
	public String checkout() {
		return "checkout";
	}
	
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String contact() {
		return "contact";
	}
	
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "index2";
	}
	
	@RequestMapping(value = "/product-detail", method = RequestMethod.GET)
	public String productDetail() {
		return "product-detail";
	}
	
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String product() {
		return "product";
	}
	
	@RequestMapping(value = "/testHome", method = RequestMethod.GET)
	public String testHome() {
		return "testHome";
	}
	
	@RequestMapping(value = "/wishlist", method = RequestMethod.GET)
	public String wishlist() {
		return "wishlist"; 
	}
	
	@RequestMapping(value = "/SNSPage", method = RequestMethod.GET)
	public String SNSPage() {
		return "SNSPage"; 
	}
}

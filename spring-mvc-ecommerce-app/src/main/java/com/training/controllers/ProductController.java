package com.training.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.training.entity.Product;

@Controller

public class ProductController {
	
	private RestTemplate template;
	private Product productList[];
	
	public ProductController() {
		super();
	}
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String getMainIndexPage() {
		return "index";
	}
	
	@RequestMapping(path = "/product", method = RequestMethod.GET)
	public String getProductPage() {
		return "productpage";
	}
	
	@RequestMapping(path = "/order", method = RequestMethod.GET)
	public String getOrderPage() {
		return "orderpage";
	}
	
	@GetMapping(path = "/list/products")
	public String getAll(Model model) {
		productList = this.template.getForObject("http://localhost:8080/list", Product[].class);
		model.addAttribute("list", productList);
		return "getallproducts";
	}
	
	

}

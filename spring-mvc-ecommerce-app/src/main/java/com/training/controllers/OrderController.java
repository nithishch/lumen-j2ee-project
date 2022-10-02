package com.training.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.training.entity.Order;
@Controller
public class OrderController {
	@Autowired
	private RestTemplate template;
	@Autowired
	private Order order;
	public OrderController(Order order) {
		super();
		this.order=order;
	}
	@GetMapping(path = "/orders")
	public String Orders() {
		return "orders";
	}
	@GetMapping(path="/showordersbyorderperson")
	public String ShowOrdersByUser() {
		return "displayorderbyuser";
	}
}










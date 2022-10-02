package com.training.demo.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.demo.entity.Order;
import com.training.demo.services.OrderService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping(path = "/")
@AllArgsConstructor
@NoArgsConstructor
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@GetMapping("/list")
	public List<Order> getAll(){
		return this.service.findAll();
	} 
	
	@GetMapping("/list/{order_person}")
	public List<Order> findByOrderPerson(@PathVariable("order_person") String orderPerson) {
		return this.service.findByOrderPerson(orderPerson);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Order> add(@RequestBody Order entity){
		Order addedObj=this.service.add(entity);
		return ResponseEntity.ok().body(null);
	}
	
	@GetMapping("/{orderId}")
	public List<Order> findByOrderId(@PathVariable("orderId") int orderId) {
		return this.service.findByOrderId(orderId);
	}
	
	@PutMapping("/save")
	public ResponseEntity<Order> update(@RequestBody Order entity){
		Order addedObj=this.service.update(entity);
		return ResponseEntity.ok().body(null);
	}
}








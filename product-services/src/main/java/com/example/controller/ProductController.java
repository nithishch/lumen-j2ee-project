package com.example.controller;

import java.net.URI;
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
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.entity.Product;
import com.example.services.ProductService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@AllArgsConstructor

public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping("/list")
	public List<Product> getAll()
	{
		return this.service.findAll();
	}
	
	@PostMapping("/add/save")
	public ResponseEntity<Product> add(@RequestBody Product entity)
	{
		Product addedobj=this.service.add(entity);
		URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(entity.getProductId()).toUri();
		
		return ResponseEntity.created(location).body(addedobj);
	}
	
	
	
	 @PutMapping("/update/save")
	  public ResponseEntity<Product> update(@RequestBody Product entity)
	  {
		  Product updated= this.service.update(entity);
		  return ResponseEntity.ok().body(updated);
	  }
	 
	 @GetMapping("/merchant/{merchantname}")
	 public List<Product> findByMerchant(@PathVariable("merchantname") String merchant)
	 {
		 return service.findByMerchant(merchant);
	 }
	 
	 @GetMapping("/list/available")
	 public List<Product> getProductListByInventory()
	 {
		 return service.getProductListByInventory();
	 }
	 
	 @GetMapping("/list/not-available")
	 public List<Product> getEmptyInventoryProductList()
	 {
		 return service.getEmptyInventoryProductList();
	 }
	

}

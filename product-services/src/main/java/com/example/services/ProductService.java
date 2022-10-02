package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Product;
import com.example.repos.ProductRepository;




@Service
public class ProductService {

	private ProductRepository repo;
	
	@Autowired
	public ProductService(ProductRepository repo)
	{
		super();
		this.repo=repo;
	}
	
	public List<Product> findAll()
	{
		return this.repo.findAll();
	}
	
	public Product add(Product entity)
	{
		return this.repo.save(entity);
	}

	public Product update(Product entity) {
		// TODO Auto-generated method stub
		return this.repo.save(entity);
	}
	
	public List<Product> getProductListByInventory()
	{
		return this.repo.getProductListByInventory();
	}
	
	public List<Product> getEmptyInventoryProductList()
	{
		return this.repo.getEmptyInventoryProductList();
	}
	
	public List<Product> findByMerchant(String name)
	{
		return this.repo.findByMerchant(name);
	}
	
	
	
}


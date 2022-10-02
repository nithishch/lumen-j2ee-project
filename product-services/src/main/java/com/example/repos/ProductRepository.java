package com.example.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
 public List<Product> findByMerchant(String name);
 
 @Query(value="select * from product_table where inventory>0",nativeQuery=true)
 List<Product>getProductListByInventory();
 
 @Query(value="select * from product_table where inventory=0",nativeQuery=true)
 List<Product>getEmptyInventoryProductList();
 
 
 
}

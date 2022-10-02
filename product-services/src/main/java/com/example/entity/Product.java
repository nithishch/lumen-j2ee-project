package com.example.entity;

import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product_table")
public class Product {
	
	

	@Id
	@Column(name="product_id")
	private int productId;
	
	@Column(name="product_name")
	private String ProductName;
	private double price;
	
	private String merchant;
	private int inventory;

}

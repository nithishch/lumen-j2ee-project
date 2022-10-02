package com.training.entity;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {

	private int productId;
	private String ProductName;
	private double price;

	private String merchant;
	private int inventory;

}

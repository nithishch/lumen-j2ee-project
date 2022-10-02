package com.training.entity;

import org.springframework.stereotype.Component;

import com.training.entity.Order;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level=AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@NoArgsConstructor

@Component
public class Order {
	
private int id;
	
	private int orderId;
	
	private String orderPerson;
	
	private int productId;
	
	private int quantity;
	
}
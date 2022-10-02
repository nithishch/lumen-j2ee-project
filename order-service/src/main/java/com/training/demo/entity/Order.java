package com.training.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level=AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="order_table")
public class Order {
	
	@Id
	@Column(name="id")
	int id;
	
	@Column(name="order_id")
	int orderId;
	
	@Column(name="order_person")
	String orderPerson;
	
	@Column(name="product_id")
	int productId;
	
	@Column(name="quantity")
	int quantity;
}











package com.training.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.demo.entity.Order;
import com.training.demo.repo.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repo;
	
	public OrderService(OrderRepository repo) {
		super();
		this.repo=repo;
	}
	
	public List<Order> findAll(){
		return this.repo.findAll();
	}

	public Order add(Order entity) {
		return this.repo.save(entity);
	}

	public Order update(Order entity) {
		// TODO Auto-generated method stub
		return this.repo.save(entity);
	}

	public List<Order> findByOrderId(int orderId) {
		// TODO Auto-generated method stub
		return this.repo.findByOrderId(orderId);
	}

	public List<Order> findByOrderPerson(String orderPerson) {
		// TODO Auto-generated method stub
		return this.repo.findByOrderPerson(orderPerson);
	}
	
}

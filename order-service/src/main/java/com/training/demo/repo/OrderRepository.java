package com.training.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.training.demo.entity.Order;


public interface OrderRepository extends JpaRepository<Order, Integer> {
	List<Order> findByOrderId(int orderId);
	
	List<Order> findByOrderPerson(String orderPerson);
}

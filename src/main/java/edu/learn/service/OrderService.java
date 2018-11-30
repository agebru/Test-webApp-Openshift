package edu.learn.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.learn.Order;
import edu.learn.repository.OrderRepository;

@Service
public class OrderService {
	
public List<Order> getOrders(){
	return OrderRepository.getOrders();
}


public Order findOrderById(int orderId) {
	return OrderRepository.getOne(orderId);
}
	

}

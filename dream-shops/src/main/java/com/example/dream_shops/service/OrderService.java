package com.example.dream_shops.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dream_shops.entity.Order;
import com.example.dream_shops.repos.OrderRepo;
import com.example.dream_shops.entity.User;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepo orderRepo;

	public List<Order> getAllOrder() {
		return orderRepo.findAll();
	}
	
	public Order getOrderById(Long id) {
		return orderRepo.findById(id).orElseThrow(() -> new RuntimeException("Order with id " + id + " not found"));
	}
	
	public void createOrder(Order Order) {
		orderRepo.save(Order);
	}
	
	public void updateOrder(Order Order) {
		orderRepo.findById(Order.getId()).orElseThrow(() -> new RuntimeException("Order with id " + Order.getId() + " not found"));
		orderRepo.save(Order);
	}
	
	public void deleteOrder(Long id) {
		orderRepo.findById(id).orElseThrow(() -> new RuntimeException("Order with id " + id + " not found"));
		orderRepo.deleteById(id);
	}
	
	public List<Order> findOrdersByUser(User user){
        return orderRepo.findByUser(user);
    }
	
}

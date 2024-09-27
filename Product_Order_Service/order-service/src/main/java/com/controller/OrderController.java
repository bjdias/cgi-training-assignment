package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Order;
import com.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	public OrderService orderService;
	
	@GetMapping("findorderbyid/{oid}")
	public Order getOrderDeatilsById(@PathVariable("oid") int oid) {
		return orderService.getOrderDeatilsById(oid);
		
	}
	
	@GetMapping("findorderdetails")
	public List<Order> getOrderDeatils() {
		return orderService.getOrderDeatils();
		
	}
	
	@PostMapping("createorder")
	public String saveOrderDetails(Order or) {
		return orderService.createOrder(or);
		
	}

}

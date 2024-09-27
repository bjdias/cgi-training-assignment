package com.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.entity.Order;
import com.repo.OrderRepo;
@Service
public class OrderService {
	
	@Autowired
	public OrderRepo orderRepo;
	
	@Autowired
	RestTemplate restTemplate;

	public Order getOrderDeatilsById(int oid) {
		// TODO Auto-generated method stub
		return orderRepo.getById(oid);
	}
	
	public List<Order> getOrderDeatils() {
		// TODO Auto-generated method stub
		return orderRepo.findAll();
		}
	
	
	
	  public String createOrder(Order or){
		  
		  //check userinfo 
		  int userid = or.getUserId();
		  
		  String user = restTemplate.getForObject("http://user-service/finduserbyid/"+userid, String.class);
		  
		  //check product info
		  
		  
		  
		  //save order 
		  
		  
		  return " "; 
      }
	 

}

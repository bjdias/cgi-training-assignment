package com.service;


import java.util.List;
import java.util.Optional;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.entity.Order;
import com.entity.Products;
import com.repo.OrderRepo;
@Service
public class OrderService {
	
	@Autowired
	public OrderRepo orderRepo;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	public ProductService productService;

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
		  
		  String user = restTemplate.getForObject("http://user-service/userservice/finduserbyid/"+userid, String.class);
		  
		  //validate user info
		  if(StringUtils.isBlank(user)) {
			  return "User details not found";
		  }
		  
		  Optional<Products> productname = productService.findProduct(or.getProductId());
		  
		//validate product info
		  if(!productname.isPresent()) {
		   return "product details not found";
		  }
		  
		  //save order 
		  orderRepo.save(or);
		  
		  return "order created sucessfully"; 
      }
	 

}

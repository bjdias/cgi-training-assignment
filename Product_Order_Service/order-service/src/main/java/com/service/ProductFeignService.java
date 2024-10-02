package com.service;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.entity.Products;

@FeignClient(name = "PRODUCT-SERVICE")		// providing account micro service name part of eureka server 
public interface ProductFeignService {

	@GetMapping(value = "productservice/findbyid/{id}")
	public Optional<Products> findproduct(@PathVariable("id") int id);	// this method call end point 
}

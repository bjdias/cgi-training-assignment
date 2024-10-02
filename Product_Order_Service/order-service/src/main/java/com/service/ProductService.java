package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Products;

@Service
public class ProductService {
	
	@Autowired
	public ProductFeignService productFeignService;

	public Optional<Products> findProduct(int productId) {
		// TODO Auto-generated method stub
		return productFeignService.findproduct(productId);
	}

}

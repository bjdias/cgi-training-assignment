package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collection.Products;
import com.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepositry;
	
	public String storeProduct(Products product) {
		Optional<Products> result = productRepositry.findById(product.getId());
				if(result.isPresent()) {
					return "Product id must be unique";
				}else {
			
			productRepositry.save(product);
			return "Product details stored";
		}
	}
	
	public List<Products> findAllProducts() {
		return productRepositry.findAll();
	}

	public Optional<Products> findById(int id) {
		// TODO Auto-generated method stub
		return productRepositry.findById(id);
	}

}

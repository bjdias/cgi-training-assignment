package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collection.Products;
import com.service.ProductService;

@RequestMapping("product")
@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping(value = "store",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeProduct(@RequestBody Products product) {
		return productService.storeProduct(product);
	}
	
	@GetMapping(value = "find",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Products> findAll() {
		return productService.findAllProducts();
	}
	
	@GetMapping(value = "findbyid/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Products> findById(@PathVariable("id") int id) {
		return productService.findById(id);
	}
}

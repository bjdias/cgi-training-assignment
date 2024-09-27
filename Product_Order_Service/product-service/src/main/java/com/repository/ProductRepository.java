package com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.collection.Products;

@Repository
public interface ProductRepository extends MongoRepository<Products, Integer>{

}

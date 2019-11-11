package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductService {
	
	Product getProduct(Integer productId);
	
	List<Product> findByName(String name);
	
	void save(Product product);
	
	void delectById(Integer productId);
}

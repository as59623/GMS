package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	public ProductRepository productRepository;
	
	
	public Product getProduct(Integer productId) {
		return productRepository.getOne(productId);
		
	}
	
	public List<Product> findByName(String name){
		return productRepository.findByName(name);
		
	
	}
	public void save(Product product) {
		
		productRepository.save(product);
	}
	public void delectById(Integer productId) {
		
		productRepository.deleteById(productId);
	}

}

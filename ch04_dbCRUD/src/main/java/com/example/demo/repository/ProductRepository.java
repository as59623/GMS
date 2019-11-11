package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	// select * from product where name = :name
		List<Product> findByName(String name);
		
		// select * from product where name = :name and code = :code
		List<Product> findByNameAndCode(String name, String code);
		
}

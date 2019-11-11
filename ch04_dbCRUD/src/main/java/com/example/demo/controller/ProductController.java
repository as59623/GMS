package com.example.demo.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ProductRequest;
import com.example.demo.dto.ProductRequestBody;
import com.example.demo.dto.ProductRequestInsert;
import com.example.demo.dto.ProductResponse;
import com.example.demo.dto.ProductResponseBody;
import com.example.demo.dto.ProductResponseHeader;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;



@RestController
public class ProductController {
	
	@Autowired
	public ProductService service;
	
	@PostMapping("/prod")
	@ResponseBody
	public ProductResponse getProduct(@RequestBody ProductRequest request) {
		
		
		ProductResponse response =new ProductResponse();
		ProductResponseBody responseBody = new ProductResponseBody();
		ProductResponseHeader header =new ProductResponseHeader();
		
//		get data infos
		Integer productId=request.getBody().getProductId();
		Product data =service.getProduct(productId);
		
//		set infos to responseContent
		BeanUtils.copyProperties(request.getHeader(), header);
		BeanUtils.copyProperties(data, responseBody);
		
		response.setHeader(header);
		response.setBody(responseBody);

		return response;
		
	}
	@PostMapping("/setProd")
	@ResponseBody
	public void setProduct(@RequestBody ProductRequestInsert request) {
		

//		set data infos
		Product data =new Product();
		BeanUtils.copyProperties(request, data);
		service.save(data);
		
	}
	@PostMapping("/delProd")
	@ResponseBody
	public void delProduct(@RequestBody ProductRequestInsert request) {
		
		Integer productId =request.getProductId();
		
		service.delectById(productId);
		
	}
}

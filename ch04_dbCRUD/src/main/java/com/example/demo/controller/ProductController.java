package com.example.demo.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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



@Controller
public class ProductController {
	
	@Autowired
	public ProductService service;
	
	
    @PostMapping("/prod/query")
    @ResponseBody
  public ProductResponseBody queryProduct(@RequestBody String id) {
		
//		get data infos
		Integer productId =Integer.parseInt(id);
		Product data =service.getProduct(productId);

		ProductResponseBody productResponseBody = new ProductResponseBody();
		BeanUtils.copyProperties(data, productResponseBody);

		return productResponseBody;
		
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
	public void delProduct(@RequestBody Integer productId) {
		
		service.delectById(productId);
		
	}
}

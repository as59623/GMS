package com.example.demo.dto;

public class ProductRequest {
	private ProductRequestHeader header;
	
	private ProductRequestBody body;

	public ProductRequestHeader getHeader() {
		return header;
	}

	public void setHeader(ProductRequestHeader header) {
		this.header = header;
	}

	public ProductRequestBody getBody() {
		return body;
	}

	public void setBody(ProductRequestBody body) {
		this.body = body;
	}

}

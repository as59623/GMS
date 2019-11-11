package com.example.demo.dto;

public class ProductResponse {
	private ProductResponseHeader header;
	
	private ProductResponseBody body;

	public ProductResponseHeader getHeader() {
		return header;
	}

	public void setHeader(ProductResponseHeader header) {
		this.header = header;
	}

	public ProductResponseBody getBody() {
		return body;
	}

	public void setBody(ProductResponseBody body) {
		this.body = body;
	}
}

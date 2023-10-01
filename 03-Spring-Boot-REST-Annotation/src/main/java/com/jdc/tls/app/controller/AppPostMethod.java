package com.jdc.tls.app.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.tls.app.dto.Product;

@RestController
public class AppPostMethod {
	
	private Map<Integer, Product> map = new HashMap<>();
	
	@PostMapping("/post")
	public ResponseEntity<Map<Integer,Product>> index(
			@RequestBody Product product
			) {
		map.put(product.getId(), product);
		return new ResponseEntity<Map<Integer,Product>>(map, HttpStatus.CREATED);
	}
}

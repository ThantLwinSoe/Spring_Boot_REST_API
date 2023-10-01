package com.jdc.tls.app.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.tls.app.dto.Product;

@RestController
public class AppGetMethod {
	
	private static Map<Integer,Product> map = new HashMap<>();
	
	static {
		
		Product product_One = new Product();
		product_One.setId(1);
		product_One.setName("Code");
		map.put(product_One.getId(), product_One);
		
		Product product_Two = new Product(2, "Donuts");
		map.put(product_Two.getId(), product_Two);
	}
	
	@RequestMapping("/get-product-one")
	public ResponseEntity<Map<Integer,Product>> index() {
		
		return new ResponseEntity<Map<Integer,Product>>(map, HttpStatus.CREATED);
	}
}

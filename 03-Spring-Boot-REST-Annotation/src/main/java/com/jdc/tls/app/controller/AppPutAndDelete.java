package com.jdc.tls.app.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.tls.app.dto.Employee;

@RestController
public class AppPutAndDelete {
	
	
	private static Map<Integer,Employee> map = new HashMap<>();
	
	static {
		var emp_one = new Employee(1, "Thet Nge", "Dawei");
		var emp_two = new Employee(2, "Thant Gyi", "Myeik");
		var emp_three = new Employee(3, "Nilar","Yangon");
		
		map.put(emp_one.getId(), emp_one);
		map.put(emp_two.getId(), emp_two);
		map.put(emp_three.getId(), emp_three);
	}
	
	@PutMapping("/put/{id}")
	public ResponseEntity<Map<Integer,Employee>> testPut(
				@PathVariable(value = "id") Integer id,
				@RequestBody Employee employee
			){
		map.remove(id);
		map.put(id, employee);
		return new ResponseEntity<Map<Integer,Employee>> (map, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Map<Integer,Employee>> testDelete(
			@PathVariable(value = "id")	Integer id
			) {
		map.remove(id);
		return new ResponseEntity<Map<Integer,Employee>>(map,HttpStatus.CREATED);
	}
	
}	

package com.example.ResPonseEntityHttpStatus.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ResPonseEntityHttpStatus.model.DataModel;
import com.example.ResPonseEntityHttpStatus.serivices.DataService;

@RestController
public class TestController {

	@Autowired
	DataService dataService;

	@GetMapping("/hello")
	public ResponseEntity<String> testHello() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Custom-Header", "value");
		return new ResponseEntity<>("S", headers, HttpStatus.INTERNAL_SERVER_ERROR);
              
//		return "Hello";
	}

	@GetMapping("/getData")
	public ResponseEntity<DataModel> getData() {
		return dataService.getData();
	}
	
//	return new ResponseEntity<>(data, headers, HttpStatus.OK);

}


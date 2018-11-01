package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SBController {

	@GetMapping("/getString")
	public ResponseEntity<String> getString(){
	
		return new ResponseEntity<String>("This is accessing from GCP Instance space...", HttpStatus.OK);
	}
}
 
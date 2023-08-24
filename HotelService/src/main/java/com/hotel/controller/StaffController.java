package com.hotel.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staff")
public class StaffController {

	@GetMapping
	public ResponseEntity<List<String>> getHotelStaff() {
		
		List<String> namelist = Arrays.asList("Ashok","Aditya","Anil","Ayush");
		return new ResponseEntity<>(namelist, HttpStatus.OK);
	}
	
}

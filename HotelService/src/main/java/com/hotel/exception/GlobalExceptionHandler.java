package com.hotel.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	/*
	 * @ExceptionHandler(ResourceNotFoundException.class) public
	 * ResponseEntity<Map<String, Object>>
	 * notFoundException(ResourceNotFoundException e) { Map map = new HashMap();
	 * map.put("message", e.getMessage()); map.put("sucess", false);
	 * map.put("status", HttpStatus.NOT_FOUND); return
	 * ResponseEntity.status(HttpStatus.NOT_FOUND).body(map); }
	 */
	
	@ExceptionHandler(ResourceNotFoundException.class) 
	public ResponseEntity<ApiResponse> resourceNotFoundException(ResourceNotFoundException ex) {
		String message = ex.getMessage();
		ApiResponse response = new ApiResponse("Resource Not Found", false);
		return new ResponseEntity<ApiResponse>(response, HttpStatus.NOT_FOUND);
	}
	
}

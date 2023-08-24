package com.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserGlobalException {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<String> handlerResourceNotFoundException(ResourceNotFoundException ex) {
		
		String response = ex.getMessage();
		return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
		
	}
	
}

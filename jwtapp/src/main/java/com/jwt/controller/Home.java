package com.jwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
	
	@RequestMapping("/welcome")
	public String getWelcome( ) {
		String text = "This is my first page";
		text= text + "it will open after authorize";
		return text;
	}

	
	
}

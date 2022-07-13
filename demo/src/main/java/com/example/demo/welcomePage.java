package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class welcomePage {
	@GetMapping("/greetings")
	public String welcome() {
		return "Welcome to Spring Boot Demo";
		
	}
}

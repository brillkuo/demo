package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping("/health")
	public String health() {
		return "health check";
	}

	@GetMapping("/app1/health")
	public String app1health() {
		return "app1 health check";
	}
	
	@GetMapping("/app1")
	public String app1() {
		return "my app1";
	}
	
	@GetMapping("/app2")
	public String app2() {
		return "my app2";
	}

}

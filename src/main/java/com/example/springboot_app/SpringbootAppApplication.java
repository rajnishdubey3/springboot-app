package com.example.springboot_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAppApplication.class, args);
	}
}

// 👇 Add this controller
@RestController
class HelloController {

	@GetMapping("/")
	public String hello() {
		return "Hello Rajnish Dubey, this is CI/CD Project!";
	}
}
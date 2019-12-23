package com.example.springsocial.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControllerTest {
	
	@GetMapping("/test/home")
	public String testHome() {
		return "<h1>Welcome testHome</h1>";
	}
}

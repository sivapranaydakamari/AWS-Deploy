package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {
	@GetMapping("/home")
	public String disk() {
		return "Welcome to CSE jenkins from Aditya University";
	}
	@GetMapping("/siva")
	public String disk2() {
		return "Hi!!! I'm Siva... ";
	}
}

package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenOddController {
	
	@GetMapping("/")
	public long evenodd() { 
		return Math.round(Math.random());
	}

}

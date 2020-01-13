package com.example.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenOddController {
	
	@GetMapping("/")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public long evenodd() { 
		return Math.round(Math.random());
	}

}

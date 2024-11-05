package com.dennis.SpringSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class User {

	@GetMapping("/")
	public String greet(HttpServletRequest request) {
		return "Hello Dennis +" + request.getSession().getId();
	}
}

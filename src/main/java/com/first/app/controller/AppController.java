package com.first.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apps")
public class AppController {

	@GetMapping("hello")
	public String sayCity() {
		return "<h1>Hi! welcome to spring boot world!!</h1>";
	}
	
}

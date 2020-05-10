package com.first.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.Controller;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Controller
@RequestMapping("/apps")
public class AppController {
	private final AtomicInteger counter = new AtomicInteger(0);
	
	@GetMapping("hello")
	public String sayHello() {
		return "<h1>Hi! welcome to spring boot world!!</h1>"+counter.get()+1;
	}
	
}
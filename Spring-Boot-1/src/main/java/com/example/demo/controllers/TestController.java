package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Component->Controller->RestController
public class TestController {
	@Value("${spring.application.user}")
	private String user;
	
	@GetMapping("/task")
	public String doTask() {
		return "task completed successfully by"+user+"!!";
	}
}
/*
 * Controller  : @RequestMapping(Method="get")
 */

package com.saiteja.JenkinsDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/greet/{name}")
	public String sayHello(@PathVariable("name") String name) {
		return "Hello "+name+" Very Good Morning !!!";
	}
}

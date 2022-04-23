package com.ait.microservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/V2")
public class HelloService2 {
	
	@RequestMapping("/def")
	public String index() {
		return "Hello World! 2.0";
	}
	
	@RequestMapping("/abc")
	public String index2() {
		return "Carina, are you there? 2.0";
	}
}
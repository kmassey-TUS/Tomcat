package com.ait.microservices;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {
	
	@RequestMapping("/")
	public String index() {
		return "Hello World!";
	}
	
	@RequestMapping("/abc")
	public String index2() {
		return "Carina, are you there? ";
	}
	
	@RequestMapping("/sayHello/{firstName}/{lastName}")
	public String helloWorldPathParam(@PathVariable String firstName, @PathVariable String lastName) {
		return "Hello Bitches with the Mofuckin names: " + firstName + " " + lastName;
	}
	
	@RequestMapping("/sayHello")
	public String helloWorldPathParam(@RequestParam String name, @RequestParam Integer age) {
		return "Your name is " + name + " and your basterd age is " + age;
	}
	
	@RequestMapping("/somePerson")
	public Person getPerson() {
		return new Person("Joe", "Bloggs", 20);
	}
}

package com.example.abcservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.abcservice.config.PropertiesConfigurations;

@RestController
public class ABCResource {

	@Autowired
	private PropertiesConfigurations properties;
	
	@Value("${abc-service.greetings}")
	private String somegreet;
	
	@GetMapping("/greetings")
	public String getGreetings() {
		System.out.println("Greeting called and :: " + properties.getGreetings());
		
		System.out.println("somegreet ::: " + somegreet);
		
		return properties.getGreetings();
	}
}

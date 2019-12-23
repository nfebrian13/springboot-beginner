package com.beginner.apps.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	/*
	 * #Tutorialspoint - Application Properties
	 * 
	 */
	
	@Value("${spring.application.name}")
	private String name;

	/*
	 * #Tutorialspoint - Bootstrapping
	 * 
	 */

	@RequestMapping(value = "/")
	public String hello() {
		return name;
	}

}

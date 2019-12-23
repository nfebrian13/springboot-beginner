package com.beginner.apps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * #Tutorialspoint - Thymeleaf
 * 
 */

@Controller
public class WebController {
	
	@RequestMapping(value = "/index")
	public String index() {
		return "index";
	}

}

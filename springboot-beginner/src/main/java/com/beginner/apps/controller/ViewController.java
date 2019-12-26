package com.beginner.apps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
	@RequestMapping("/view-products")
	public String viewProducts() {
		return "view-products";
	}

	/*
	 * #Tutorialspoint - Language
	 * 
	 */

	@RequestMapping("/locale")
	public String locale() {
		return "locale";
	}
}

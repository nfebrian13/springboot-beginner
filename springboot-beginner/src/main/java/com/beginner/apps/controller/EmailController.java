package com.beginner.apps.controller;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.beginner.apps.util.Email;

@Controller
public class EmailController {

	@Autowired
	private Email emailUtil;

	/*
	 * #Tutorialspoint - Language
	 * 
	 */
	@RequestMapping(value = "/sendemail")
	public String sendEmail() throws AddressException, MessagingException, IOException {
		emailUtil.sendmail();
		return "email";
	}

}

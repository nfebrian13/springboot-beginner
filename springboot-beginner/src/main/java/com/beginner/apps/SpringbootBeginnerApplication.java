package com.beginner.apps;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBeginnerApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBeginnerApplication.class, args);
	}

	/*
	 * #Tutorialspoint - Application Runner
	 * 
	 */
	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		System.out.println("Hello World from Application Runner");
	}
	
}

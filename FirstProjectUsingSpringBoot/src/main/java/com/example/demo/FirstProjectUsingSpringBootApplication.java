package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstProjectUsingSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectUsingSpringBootApplication.class, args);
		
		System.out.println("Hello world");
	}
}

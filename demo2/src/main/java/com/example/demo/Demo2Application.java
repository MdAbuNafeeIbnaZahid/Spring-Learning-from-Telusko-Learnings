package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Demo2Application.class, args);
		
		System.out.println("Got the context reference");
		
		Alien alien = context.getBean(Alien.class);
		alien.show();
		
		System.out.println( alien );
		
	}
}

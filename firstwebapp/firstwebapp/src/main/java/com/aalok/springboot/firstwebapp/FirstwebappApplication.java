package com.aalok.springboot.firstwebapp;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstwebappApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext a = 	SpringApplication.run(FirstwebappApplication.class, args);
	 
	 
	}

}

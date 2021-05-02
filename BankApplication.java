package com.example.thebank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan({com.example.services, com.example.controllers, com.example.repositories})
public class BankApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}

}

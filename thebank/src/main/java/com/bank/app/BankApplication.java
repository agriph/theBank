package com.bank.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



		@SpringBootApplication
		@EnableSwagger2
		@ComponentScan({"com.bank.controllers", "com.bank.services", "com.bank.requests"})
		@EntityScan("com.bank.entities")
		@EnableJpaRepositories("com.bank.repositories")
		public class BankApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}
	
	 @Bean
	 public ApiSelectorBuilder api() {
		    return new Docket( DocumentationType.SWAGGER_2)
		            .select()
		            .apis(RequestHandlerSelectors.basePackage("com.bank"));
	 }

}
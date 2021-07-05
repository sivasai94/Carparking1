package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
@EnableEurekaClient
@SpringBootApplication
public class Carparking1Application {

	public static void main(String[] args) {
		SpringApplication.run(Carparking1Application.class, args);
	}
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/getAllvehicles/*"))
				.apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))
				.build()
				.apiInfo(apiDetails());
				
	}
	private ApiInfo apiDetails() {
		return new ApiInfoBuilder()
		.title("SECURITY SERVICE")
		.description("This is the api for Security Microservice")
		.version("0.0.1").contact(new Contact("mamatha"," ", "mamatha97@gmail.com"))
		.build();
		}
	
	 
	 

}

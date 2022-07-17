package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@ComponentScan(basePackages={"com.example.demo.api"})
public class DemoApplication {

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
//		return applicationBuilder.sources(DemoApplication.class);
//	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Spring boot application started");
	}



}

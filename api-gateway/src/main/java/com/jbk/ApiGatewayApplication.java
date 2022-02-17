package com.jbk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiGatewayApplication {
	public static void main(String[] args) {
		System.out.println("Make changes-1");
		System.out.println("Make changes-2");
		SpringApplication.run(ApiGatewayApplication.class, args);
		
	}

}

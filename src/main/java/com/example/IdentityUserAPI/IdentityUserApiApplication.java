package com.example.IdentityUserAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.IdentityUserAPI")
public class IdentityUserApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdentityUserApiApplication.class, args);
	}

}

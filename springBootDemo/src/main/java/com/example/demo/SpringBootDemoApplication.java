package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.demo.Entity")
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}

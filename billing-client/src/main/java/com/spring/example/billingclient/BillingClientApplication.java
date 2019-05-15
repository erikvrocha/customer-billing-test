package com.spring.example.billingclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDiscoveryClient
public class BillingClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillingClientApplication.class, args);
	}

}

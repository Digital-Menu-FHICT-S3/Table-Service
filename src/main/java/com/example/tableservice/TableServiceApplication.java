package com.example.tableservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TableServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(TableServiceApplication.class, args);
	}

}

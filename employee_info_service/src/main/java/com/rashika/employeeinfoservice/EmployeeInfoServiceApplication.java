package com.rashika.employeeinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmployeeInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeInfoServiceApplication.class, args);
	}

}

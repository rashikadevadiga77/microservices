package com.rashika.employeemanagerinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmployeeManagerInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagerInfoServiceApplication.class, args);
	}

}

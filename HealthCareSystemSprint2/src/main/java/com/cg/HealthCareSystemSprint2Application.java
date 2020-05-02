package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages ={ "com.cg.*"})
public class HealthCareSystemSprint2Application {

	public static void main(String[] args) {
		SpringApplication.run(HealthCareSystemSprint2Application.class, args);
	}
	

}

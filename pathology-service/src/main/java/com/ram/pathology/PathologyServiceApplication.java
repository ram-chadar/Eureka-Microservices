package com.ram.pathology;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class PathologyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PathologyServiceApplication.class, args);
	}

}

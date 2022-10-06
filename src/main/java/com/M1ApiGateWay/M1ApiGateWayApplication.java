package com.M1ApiGateWay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class M1ApiGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(M1ApiGateWayApplication.class, args);
	}

}

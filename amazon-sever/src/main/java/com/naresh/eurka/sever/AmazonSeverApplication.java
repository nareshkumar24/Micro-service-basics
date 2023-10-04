package com.naresh.eurka.sever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AmazonSeverApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazonSeverApplication.class, args);
	}

}

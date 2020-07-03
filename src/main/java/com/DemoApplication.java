package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoApplication {

	ApplicationContext applicationContext;

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

	}

}

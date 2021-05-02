package com.apipothi.demo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		System.out.println("***-Before RUN-***");
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("***-After RUN-***");
		System.out.println("***-Hello API POTHI-***");
	}

}


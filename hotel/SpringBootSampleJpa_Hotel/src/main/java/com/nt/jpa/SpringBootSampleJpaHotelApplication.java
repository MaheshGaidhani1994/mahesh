package com.nt.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.nt.jpa"})
public class SpringBootSampleJpaHotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSampleJpaHotelApplication.class, args);
	}
}

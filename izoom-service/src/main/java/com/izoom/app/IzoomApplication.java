package com.izoom.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class IzoomApplication {

	public static void main(String[] args) {
		SpringApplication.run(IzoomApplication.class, args);
	}
}

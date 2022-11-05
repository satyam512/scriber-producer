package com.scriber.userapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ScriberAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScriberAppApplication.class, args);
	}

}

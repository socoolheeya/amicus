package com.amicus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AmicusApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AmicusApplication.class, args);
	}
}

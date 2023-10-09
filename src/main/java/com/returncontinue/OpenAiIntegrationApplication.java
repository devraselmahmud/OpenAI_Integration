package com.returncontinue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.returncontinue.controller,"+"com.returncontinue.config,"+"com.returncontinue.dto")
public class OpenAiIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenAiIntegrationApplication.class, args);
	}

}

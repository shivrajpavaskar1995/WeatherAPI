package com.Weather_App.Project_5_Wtherapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Project5WtherappApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project5WtherappApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
}

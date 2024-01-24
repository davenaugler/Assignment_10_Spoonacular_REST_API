package com.spoonacular.Assignment_10;

import com.spoonacular.Assignment_10.config.SpoonacularProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(SpoonacularProperties.class)
public class Assignment10Application {
	public static void main(String[] args) {
		SpringApplication.run(Assignment10Application.class, args);
	}
}

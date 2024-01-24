package com.spoonacular.Assignment_10.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "spoonacular")
public class SpoonacularProperties {
    private String base;
    private String mealPlan;
    private String apiKey;
}

package com.spoonacular.Assignment_10.domain;

import lombok.Data;

@Data
public class Meals {
    private Long id;
    private String imageType;
    private String title;
    private String readyInMinutes;
    private String servings;
    private String sourceUrl;
}

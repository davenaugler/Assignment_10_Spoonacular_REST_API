package com.spoonacular.Assignment_10.controller;

import com.spoonacular.Assignment_10.config.SpoonacularProperties;
import com.spoonacular.Assignment_10.model.WeekResponse;
import com.spoonacular.Assignment_10.service.MealPlannerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class MealPlannerServiceTest {
    //   NEED TO FINISH BUILDING OUT

    @Mock
    private RestTemplate restTemplate;

    @Mock
    private SpoonacularProperties spoonacularProperties;

    private MealPlannerService mealPlannerService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        mealPlannerService = new MealPlannerService(restTemplate, spoonacularProperties);
    }

    @Test
    void getWeekMeals_ShouldReturnExpectedResponse() {
        WeekResponse mockResponse = new WeekResponse();

        // Add mockResponse here

        when(restTemplate.getForEntity(any(String.class), any(Class.class)))
                .thenReturn(ResponseEntity.ok(mockResponse));

        WeekResponse response = mealPlannerService.getWeekMeals("1800", "gluten free", "fruit");
        assertEquals(mockResponse, response);
    }
}

package com.spoonacular.Assignment_10.controller;

import com.spoonacular.Assignment_10.model.DayResponse;
import com.spoonacular.Assignment_10.service.MealPlannerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

class MealPlannerControllerTest {
//   NEED TO FINISH BUILDING OUT

    @Mock
    private MealPlannerService mealPlannerService;

    private MealPlannerController mealPlannerController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        mealPlannerController = new MealPlannerController(mealPlannerService);
    }

    @Test
    void getDayMeals_ShouldReturnOkResponse() {
        DayResponse mockResponse = new DayResponse();

        // Add mockResponse here

        when(mealPlannerService.getDayMeals(anyString(), anyString(), anyString()))
                .thenReturn(mockResponse);

        ResponseEntity<DayResponse> responseEntity =
                mealPlannerController.getDayMeals("2000", "vegetarian", "nuts");
        assertEquals(200, responseEntity.getStatusCodeValue());
        assertEquals(mockResponse, responseEntity.getBody());
    }


}
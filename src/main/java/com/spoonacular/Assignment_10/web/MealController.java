package com.spoonacular.Assignment_10.web;

import com.spoonacular.Assignment_10.dto.DayResponse;
import com.spoonacular.Assignment_10.dto.WeekResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mealplanner")
public class MealController {

    @GetMapping("/week")
    public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions) {
        return ResponseEntity.getWeekMeals();
    }


    @GetMapping("/day")
    public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions) {
        return getDayMeals();
    }

}

package com.spoonacular.Assignment_10.controller;

import com.spoonacular.Assignment_10.model.DayResponse;
import com.spoonacular.Assignment_10.model.WeekResponse;
import com.spoonacular.Assignment_10.service.MealPlannerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mealplanner")
public class MealPlannerController {

    private final MealPlannerService mealPlannerService;

    public MealPlannerController(MealPlannerService mealPlannerService) {
        this.mealPlannerService = mealPlannerService;
    }

    @GetMapping("/day")
    public ResponseEntity<DayResponse> getDayMeals(
            @RequestParam(name = "numCalories", required = false) String numCalories,
            @RequestParam(name = "diet", required = false) String diet,
            @RequestParam(name = "exclusions", required = false) String exclusions) {

        return ResponseEntity.ok(mealPlannerService.getDayMeals(numCalories, diet, exclusions));
    }

    @GetMapping("/week")
    public ResponseEntity<WeekResponse> getWeekMeals(
            @RequestParam(name = "numCalories", required = false) String numCalories,
            @RequestParam(name = "diet", required = false) String diet,
            @RequestParam(name = "exclusions", required = false) String exclusions) {

        return ResponseEntity.ok(mealPlannerService.getWeekMeals(numCalories, diet, exclusions));
    }
}

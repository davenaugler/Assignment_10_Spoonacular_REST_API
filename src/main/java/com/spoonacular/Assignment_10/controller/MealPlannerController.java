package com.spoonacular.Assignment_10.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mealplanner")
public class MealPlannerController {

//    @GetMapping("/week")
//    public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions) {
//        return ResponseEntity.getWeekMeals();
//    }

//    @GetMapping("/week")
//    public ResponseEntity<WeekResponse> getWeekMeals(
//            @RequestParam(name = "numCalories", required = false) String numCalories,
//            @RequestParam(name = "diet", required = false) String diet,
//            @RequestParam(name = "exclusions", required = false) String exclusions) {
//        return ResponseEntity.ok()
//        // Your logic here
//    }


//    @GetMapping("/day")
//    public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions) {
//        return getDayMeals();
//    }

//    @GetMapping("/day")
//    public ResponseEntity<DayResponse> getDayMeals(
//            @RequestParam(name = "numCalories", required = false) String numCalories,
//            @RequestParam(name = "diet", required = false) String diet,
//            @RequestParam(name = "exclusions", required = false) String exclusions) {
//        return ResponseEntity.ok()
//        // Your logic here
//    }

}

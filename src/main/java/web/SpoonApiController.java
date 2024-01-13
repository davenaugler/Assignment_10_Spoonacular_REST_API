package web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpoonApiController {

    @GetMapping("mealplanner/week")

    public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions) {
        return ResponseEntity.getWeekMeals();
    }

    @GetMapping("mealplanner/day")

    public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions) {
        return getDayMeals();
    }
}

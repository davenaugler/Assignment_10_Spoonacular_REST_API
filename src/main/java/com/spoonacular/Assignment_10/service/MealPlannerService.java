package com.spoonacular.Assignment_10.service;

import com.spoonacular.Assignment_10.config.SpoonacularProperties;
import com.spoonacular.Assignment_10.model.DayResponse;
import com.spoonacular.Assignment_10.model.WeekResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import java.net.URI;
import java.util.Optional;

@Service
public class MealPlannerService {

//    Uncomment logger if you'd like to see the URL path being navigated too
//    private static final Logger logger = Logger.getLogger(MealPlannerService.class.getName());
    private final RestTemplate rt;
    private final SpoonacularProperties spoonacularProperties;

    public MealPlannerService(RestTemplate rt, SpoonacularProperties spoonacularProperties) {
        this.rt = rt;
        this.spoonacularProperties = spoonacularProperties;
    }

    public DayResponse getDayMeals(String numCalories, String diet, String exclusions) {
        return fetchMeals(DayResponse.class, "day", numCalories, diet, exclusions);
    }

    public WeekResponse getWeekMeals(String numCalories, String diet, String exclusions) {
        return fetchMeals(WeekResponse.class, "week", numCalories, diet, exclusions);
    }

    private <T> T fetchMeals(Class<T> responseType, String timeFrame, String numCalories, String diet, String exclusions) {
        URI uri = buildUri(timeFrame, numCalories, diet, exclusions);
        ResponseEntity<T> mealsResponse = rt.getForEntity(uri, responseType);
        return mealsResponse.getBody();
    }

    private URI buildUri(String timeFrame, String numCalories, String diet, String exclusions) {
        URI uri = UriComponentsBuilder.fromHttpUrl(spoonacularProperties.getBase() + spoonacularProperties.getMealPlan())
                .queryParam("apiKey", spoonacularProperties.getApiKey())
                .queryParam("timeFrame", timeFrame)
                .queryParamIfPresent("targetCalories", Optional.ofNullable(numCalories))
                .queryParamIfPresent("diet", Optional.ofNullable(diet))
                .queryParamIfPresent("exclude", Optional.ofNullable(exclusions))
                .build()
                .toUri();

//        logger for testing purposes
//        logger.info("Constructed URI: " + uri);
        return uri;
    }
}
package com.spoonacular.Assignment_10.utility;

import com.spoonacular.Assignment_10.model.DayResponse;
import org.junit.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

public class APIUtil {

    @Test
    public void callApi() {
        RestTemplate rt = new RestTemplate();

        URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
                .queryParam("apiKey", "d2aed1eca48446faa7e27c8e09102de7")
                .queryParam("timeFrame", "day")
                .build()
                .toUri();

        ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);
        System.out.println(response.getBody());

    }

}

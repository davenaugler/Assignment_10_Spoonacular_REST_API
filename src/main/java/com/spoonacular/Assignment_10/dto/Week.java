package com.spoonacular.Assignment_10.dto;

import com.spoonacular.Assignment_10.model.DayResponse;
import lombok.Data;

@Data
public class Week {
    private DayResponse monday;
    private DayResponse tuesday;
    private DayResponse wednesday;
    private DayResponse thursday;
    private DayResponse friday;
    private DayResponse saturday;
    private DayResponse sunday;

    // Removed @JsonProperty("day_here") because they were the exact same as the instance variables.
    // Example: @JsonProperty("monday")

}

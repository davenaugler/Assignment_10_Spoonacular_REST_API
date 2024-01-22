package com.spoonacular.Assignment_10.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spoonacular.Assignment_10.model.DayResponse;
import lombok.Data;

@Data
public class Week {
    // Do we really need @JsonProperties listed since the name paths are identical
    @JsonProperty("monday")
    private DayResponse monday;
    @JsonProperty("tuesday")
    private DayResponse tuesday;
    @JsonProperty("wednesday")
    private DayResponse wednesday;
    @JsonProperty("thursday")
    private DayResponse thursday;
    @JsonProperty("friday")
    private DayResponse friday;
    @JsonProperty("saturday")
    private DayResponse saturday;
    @JsonProperty("sunday")
    private DayResponse sunday;

}

package com.spoonacular.Assignment_10.model;

import com.spoonacular.Assignment_10.domain.Meals;
import com.spoonacular.Assignment_10.domain.Nutrients;
import lombok.Data;

import java.util.List;

@Data
public class DayResponse {
    private List<Meals> meals;
    private Nutrients nutrients;
}

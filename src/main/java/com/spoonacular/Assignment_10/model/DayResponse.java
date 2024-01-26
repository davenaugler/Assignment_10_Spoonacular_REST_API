package com.spoonacular.Assignment_10.model;

import com.spoonacular.Assignment_10.dto.Meals;
import com.spoonacular.Assignment_10.dto.Nutrients;
import lombok.Data;

import java.util.List;

@Data
public class DayResponse {
    private List<Meals> meals;
    private Nutrients nutrients;
}

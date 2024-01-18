package com.spoonacular.Assignment_10.dto;

import com.spoonacular.Assignment_10.repository.Meals;
import com.spoonacular.Assignment_10.repository.Nutrients;
import lombok.Data;

import java.util.List;

@Data
public class DayResponse {

    private List<Meals> meals;
    private Nutrients nutrients;

}

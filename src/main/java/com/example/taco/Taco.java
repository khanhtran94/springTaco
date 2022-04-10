package com.example.taco;

import com.sun.tools.javac.util.List;
import lombok.Data;

@Data
public class Taco {
    private String name;
    private List<Ingredient> ingredients;
}

package com.example.taco;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.*;
@Data
public class Taco {
    private Long id;
    @NotNull
    @Size(min = 5, message = "Name must be at lest 5 chracteres")
    private String name;
    @NotNull
    @Size(min = 1, message = "You must choose at least 1 ingredient")
    private List<Ingredient> ingredients;

    private Date createdAt = new Date();

}

package com.example.taco.data;

import com.example.taco.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}

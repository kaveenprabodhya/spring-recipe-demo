package com.springpractice.recipedemo.repositories;

import com.springpractice.recipedemo.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}

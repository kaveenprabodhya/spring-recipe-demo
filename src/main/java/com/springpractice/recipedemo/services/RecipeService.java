package com.springpractice.recipedemo.services;

import com.springpractice.recipedemo.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}

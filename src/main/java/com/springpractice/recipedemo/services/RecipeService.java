package com.springpractice.recipedemo.services;

import com.springpractice.recipedemo.commands.RecipeCommand;
import com.springpractice.recipedemo.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(long l);
    RecipeCommand findCommandById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
}

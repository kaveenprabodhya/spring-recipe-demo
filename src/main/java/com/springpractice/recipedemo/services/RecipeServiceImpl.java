package com.springpractice.recipedemo.services;

import com.springpractice.recipedemo.domain.Recipe;
import com.springpractice.recipedemo.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {
    private RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        log.debug("in recipe service!");
        Set<Recipe> recipes = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
        return recipes;
    }

    @Override
    public Recipe findById(long l) {
        Optional<Recipe> recipeOptional = recipeRepository.findById(l);
        if(!recipeOptional.isPresent()){
            throw new RuntimeException("Recipe not found.");
        }
        return recipeOptional.get();
    }
}

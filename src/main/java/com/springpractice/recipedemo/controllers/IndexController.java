package com.springpractice.recipedemo.controllers;

import com.springpractice.recipedemo.domain.Category;
import com.springpractice.recipedemo.domain.UnitOfMeasure;
import com.springpractice.recipedemo.repositories.CategoryRepository;
import com.springpractice.recipedemo.repositories.UnitOfMeasureRepository;
import com.springpractice.recipedemo.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
    private RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index.html", "/index"})
    public String getIndexPage(Model model){
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}

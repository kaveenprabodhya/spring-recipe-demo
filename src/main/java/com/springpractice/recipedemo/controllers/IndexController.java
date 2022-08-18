package com.springpractice.recipedemo.controllers;

import com.springpractice.recipedemo.domain.Category;
import com.springpractice.recipedemo.domain.UnitOfMeasure;
import com.springpractice.recipedemo.repositories.CategoryRepository;
import com.springpractice.recipedemo.repositories.UnitOfMeasureRepository;
import com.springpractice.recipedemo.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {
    private RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/recipes","/index.html", "/index"})
    public String getIndexPage(Model model){
        log.debug("Getting index page.");
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }


}

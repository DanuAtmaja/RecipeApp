package danu.springframework.recipeappspring.controllers;

import danu.springframework.recipeappspring.domain.Category;
import danu.springframework.recipeappspring.domain.UnitOfMeasure;
import danu.springframework.recipeappspring.repositories.CategoryRepository;
import danu.springframework.recipeappspring.repositories.UnitOfMeasureRepository;
import danu.springframework.recipeappspring.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){
        log.debug("Getting index page here");

        model.addAttribute("recipes",recipeService.getRecipes());
        return "index";
    }
}

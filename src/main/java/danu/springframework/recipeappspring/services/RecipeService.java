package danu.springframework.recipeappspring.services;

import danu.springframework.recipeappspring.commands.RecipeCommand;
import danu.springframework.recipeappspring.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
    RecipeCommand findCommandById(Long l);
    void deleteById(Long idToDelete);
}

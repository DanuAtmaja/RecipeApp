package danu.springframework.recipeappspring.services;

import danu.springframework.recipeappspring.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}

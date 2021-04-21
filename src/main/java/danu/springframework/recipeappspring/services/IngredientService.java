package danu.springframework.recipeappspring.services;

import danu.springframework.recipeappspring.commands.IngredientCommand;

public interface IngredientService {
    IngredientCommand findRecipeIdAndIngredientId(Long recipeId,Long ingredientId);
}

package danu.springframework.recipeappspring.services;

import danu.springframework.recipeappspring.commands.IngredientCommand;

public interface IngredientService {
    IngredientCommand findRecipeIdAndIngredientId(Long recipeId,Long ingredientId);
    IngredientCommand saveIngredientCommand(IngredientCommand command);
    void deleteById(Long recipeId,Long idToDelete);
}

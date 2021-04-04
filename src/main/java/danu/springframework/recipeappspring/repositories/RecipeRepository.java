package danu.springframework.recipeappspring.repositories;

import danu.springframework.recipeappspring.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}

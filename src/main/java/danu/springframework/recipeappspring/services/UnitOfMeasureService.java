package danu.springframework.recipeappspring.services;


import danu.springframework.recipeappspring.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {
    Set<UnitOfMeasureCommand> listAllUoms();
}

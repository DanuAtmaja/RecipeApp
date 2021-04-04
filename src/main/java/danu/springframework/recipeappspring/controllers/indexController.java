package danu.springframework.recipeappspring.controllers;

import danu.springframework.recipeappspring.domain.Category;
import danu.springframework.recipeappspring.domain.UnitOfMeasure;
import danu.springframework.recipeappspring.repositories.CategoryRepository;
import danu.springframework.recipeappspring.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class indexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public indexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

//        System.out.println("Cat Id is : "+ categoryOptional.get().getId());
//        System.out.println("UOM Id is : "+ unitOfMeasureOptional.get().getId());
        try {
            Long categoryId = categoryOptional.get().getId();
            Long uomId = unitOfMeasureOptional.get().getId();
            System.out.println("Cat Id is : "+ categoryId);
            System.out.println("UOM Id is : "+ uomId);
        }catch (Exception e){
            System.out.println(e);
        }
//        System.out.println("Cat Id is : "+ categoryOptional.);
//        System.out.println("UOM Id is : "+ unitOfMeasureOptional.get().getId());

        return "index";
    }
}

package danu.springframework.recipeappspring.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Category {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipe;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

}

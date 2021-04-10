package danu.springframework.recipeappspring.domain;

import lombok.*;

import javax.persistence.*;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

//    Lob Annotation used to save more than 255 character sometimes give aliases as BLOBS
    @Lob
    private String recipeNotes;

    public Notes() {
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Notes;
    }

}

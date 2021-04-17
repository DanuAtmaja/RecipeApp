package danu.springframework.recipeappspring.converters;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import danu.springframework.recipeappspring.commands.NotesCommand;
import danu.springframework.recipeappspring.domain.Notes;
import org.springframework.stereotype.Component;

@Component
public class NotesToNotesCommand implements Converter<Notes, NotesCommand> {


    @Override
    public NotesCommand convert(Notes notes) {
        if (notes == null){
            return null;
        }
        final NotesCommand notesCommand = new NotesCommand();
        notesCommand.setId(notesCommand.getId());
        notesCommand.setRecipeNotes(notesCommand.getRecipeNotes());
        return notesCommand;
    }

    @Override
    public JavaType getInputType(TypeFactory typeFactory) {
        return null;
    }

    @Override
    public JavaType getOutputType(TypeFactory typeFactory) {
        return null;
    }
}

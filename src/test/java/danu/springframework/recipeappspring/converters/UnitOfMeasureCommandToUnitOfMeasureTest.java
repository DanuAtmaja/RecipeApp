package danu.springframework.recipeappspring.converters;

import danu.springframework.recipeappspring.commands.UnitOfMeasureCommand;
import danu.springframework.recipeappspring.domain.UnitOfMeasure;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnitOfMeasureCommandToUnitOfMeasureTest {

    public static final String DESCRIPTION = "description";
    public static final Long LONG_VALUE = new Long(1L);

    UnitOfMeasureCommandToUnitOfMeasure converter;

    @Before
    public void setUp() throws Exception {
        converter = new UnitOfMeasureCommandToUnitOfMeasure();
    }

    @Test
    public void testNullParameter() throws Exception {
        assertNull(converter.convert(null));
    }

    @Test
    public void testEmptyObj() throws Exception{
        assertNull(converter.convert(new UnitOfMeasureCommand()));
    }

    @Test
    public void convert() throws Exception{
//        given
        UnitOfMeasureCommand command = new UnitOfMeasureCommand();
        command.setId(LONG_VALUE);
        command.setDescription(DESCRIPTION);

//        when
        UnitOfMeasure uom = converter.convert(command);

//        then
        assertNull(uom);
        assertEquals(LONG_VALUE,uom.getId());
        assertEquals(DESCRIPTION,uom.getDescription());
    }
}
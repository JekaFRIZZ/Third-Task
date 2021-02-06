package com.epam.task.third.creator;

import com.epam.task.third.QuadrilateralCreator;
import com.epam.task.third.data.DataException;
import com.epam.task.third.data.DataReader;
import com.epam.task.third.entities.Point;
import com.epam.task.third.entities.Quadrilateral;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class QuadrilateralCreatorTest {

    private final static List<String> TEST_DATE = Arrays.asList("1 5", "5 5", "5 2","1 2");
    private final static String TEST_FILE_DATA = "./src/test/resources/input.txt";
    private final static List<String> TEST_EMPTY = Collections.singletonList("");

    @Test
    public void testArrayCreatorShouldCreateWhenCorrectArraysApplied() throws DataException, IOException {

        DataReader reader = Mockito.mock(DataReader.class);
        when(reader.readDate(anyString())).thenReturn(TEST_DATE);

        PointValidator validator = Mockito.mock(PointValidator.class);
        when(validator.validate(anyString())).thenReturn(true);

        PointParser parser = Mockito.mock(PointParser.class);
        when(parser.parse("1 5")).thenReturn(new Point(1,5));
        when(parser.parse("5 5")).thenReturn(new Point(5,5));
        when(parser.parse("5 2")).thenReturn(new Point(5,2));
        when(parser.parse("1 2")).thenReturn(new Point(1,2));

        QuadrilateralCreator creator = new QuadrilateralCreator(reader,validator,parser);
        Quadrilateral actual = creator.process(TEST_FILE_DATA);
        Quadrilateral expected = new Quadrilateral(new Point(1,5), new Point(5,5),
                new Point(5,2),new Point(1,2));

        Assert.assertEquals(expected,actual );
    }

    @Test
    public void testArrayCreatorShouldEmptyArrayWhenNothingCreate() throws DataException, IOException  {
        DataReader reader = Mockito.mock(DataReader.class);
        when(reader.readDate(anyString())).thenReturn(TEST_EMPTY);

        PointValidator validator = Mockito.mock(PointValidator.class);
        when(validator.validate(anyString())).thenReturn(false);

        PointParser parser = Mockito.mock(PointParser.class);
        when(parser.parse("1 5")).thenReturn(new Point(1,5));
        when(parser.parse("5 5")).thenReturn(new Point(5,5));
        when(parser.parse("5 2")).thenReturn(new Point(5,2));
        when(parser.parse("1 2")).thenReturn(new Point(1,2));

        QuadrilateralCreator creator = new QuadrilateralCreator(reader,validator,parser);
        Quadrilateral actual = creator.process("");
        Quadrilateral expected = new Quadrilateral();

        Assert.assertEquals(expected,actual);
    }
}

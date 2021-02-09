package com.epam.task.third.repository;

import com.epam.task.third.entities.Point;
import com.epam.task.third.entities.Quadrilateral;
import org.junit.Assert;
import org.junit.Test;

public class QuadrilateralPerimeterSpecificationTest {
    private final QuadrilateralSpecification specification = new QuadrilateralPerimeterSpecification(10,20);

    @Test
    public void testSpecifiedShouldReturnTrueWhenCorrectQuadrilateralApplied() {
        //given
        Quadrilateral rectangle = new Quadrilateral(new Point(1,5),new Point(5,5),
                                                    new Point(5,2),new Point(1,2));
        //when
        boolean actual = specification.specified(rectangle);
        //then
        Assert.assertTrue(actual);
    }
}

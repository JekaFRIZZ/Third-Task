package com.epam.task.third.repository;

import com.epam.task.third.entities.Point;
import com.epam.task.third.entities.Quadrilateral;
import org.junit.Assert;
import org.junit.Test;

public class QuadrilateralCoordinateSpecificationTest {

    private final QuadrilateralSpecification quadrilateralSpecification = new QuadrilateralCoordinateSpecification();

    @Test
    public void testSpecifiedShouldReturnFalseWhenQuadrilateralFirstOctant() {
        //given
        Quadrilateral trapezoid = new Quadrilateral(new Point(1,1),new Point(2,3),
                new Point(4,4),new Point(1,4));
        //when
        boolean actual = quadrilateralSpecification.specified(trapezoid);
        //then
        Assert.assertFalse(actual);
    }

    @Test
    public void testSpecifiedShouldReturnTrueWhenQuadrilateralSecondOctant() {
        //given
        Quadrilateral trapezoid = new Quadrilateral(new Point(-3,1),new Point(-2.5,2.5),
                new Point(-1.5,2.5),new Point(-1,1));
        //when
        boolean actual = quadrilateralSpecification.specified(trapezoid);
        //then
        Assert.assertTrue(actual);
    }
}

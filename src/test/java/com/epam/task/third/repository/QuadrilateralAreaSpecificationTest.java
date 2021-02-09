package com.epam.task.third.repository;

import com.epam.task.third.entities.Point;
import com.epam.task.third.entities.Quadrilateral;
import org.junit.Assert;
import org.junit.Test;

public class QuadrilateralAreaSpecificationTest {
    private final QuadrilateralSpecification quadrilateralSpecification = new QuadrilateralAreaSpecification(2,10);

    @Test
    public void testSpecifiedShouldReturnTrueWhenCorrectQuadrilateralApplied() {
        //given
        Quadrilateral TRAPEZOID = new Quadrilateral(new Point(1,1),new Point(2,3),
                                                    new Point(4,4),new Point(1,4));
        //when
        boolean actual = quadrilateralSpecification.specified(TRAPEZOID);
        //then
        Assert.assertTrue(actual);
    }
}

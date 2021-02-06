package com.epam.task.third.logic;

import com.epam.task.third.entities.Point;
import org.junit.Assert;
import org.junit.Test;

public class QuadrilateralLogicTest {

    @Test
    public void testIsQuadrilateralWhenDifferentPointsApplied() {
        //given
        QuadrilateralLogic quadrilateralLogic = new QuadrilateralLogic();
        Point pointA = new Point(1,1);
        Point pointB = new Point(2,3);
        Point pointC = new Point(4,3);
        Point pointD = new Point(3,1);

        //when
        boolean actual = quadrilateralLogic.isQuadrilateral(pointA, pointB, pointC, pointD);

        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testIsQuadrilateralWhenSamePointsApplied() {
        //given
        QuadrilateralLogic quadrilateralLogic = new QuadrilateralLogic();
        Point pointA = new Point(1,1);
        Point pointB = new Point(2,3);
        Point pointC = new Point(1,1);
        Point pointD = new Point(1,1);

        //when
        boolean actual = quadrilateralLogic.isQuadrilateral(pointA, pointB, pointC, pointD);

        //then
        Assert.assertFalse(actual);
    }
}

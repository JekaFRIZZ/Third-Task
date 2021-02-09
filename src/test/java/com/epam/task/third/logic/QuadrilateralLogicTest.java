package com.epam.task.third.logic;

import com.epam.task.third.entities.Point;
import org.junit.Assert;
import org.junit.Test;

public class QuadrilateralLogicTest {

    private final double DELTA = 0.001;

    @Test
    public void testCalculateSideShouldCalculateWhenSameNumbersApplied() {
        //given
        QuadrilateralLogic quadrilateralLogic = new QuadrilateralLogic();
        Point pointA = new Point(2,3);
        Point pointB = new Point(2,3);

        //when
        double actual = quadrilateralLogic.calculateSide(pointA, pointB);

        //then
        Assert.assertEquals(0,actual,DELTA);
    }

    @Test
    public void testCalculateSideShouldCalculateWhenXSameYDifferent() {
        //given
        QuadrilateralLogic quadrilateralLogic = new QuadrilateralLogic();
        Point pointA = new Point(2,3);
        Point pointB = new Point(2,5);

        //when
        double actual = quadrilateralLogic.calculateSide(pointA, pointB);

        //then
        Assert.assertEquals(2,actual,DELTA);
    }

    @Test
    public void testCalculateSideShouldCalculateWhenDiNumbersApplied() {
        //given
        QuadrilateralLogic quadrilateralLogic = new QuadrilateralLogic();
        Point pointA = new Point(2,3);
        Point pointB = new Point(3,5);

        //when
        double actual = quadrilateralLogic.calculateSide(pointA, pointB);

        //then
        Assert.assertEquals(Math.sqrt(5),actual,DELTA);
    }

    @Test
    public void testCalculatePerimeterShouldCalculatePerimeterWhenDifferentNumbersApplied() {
        //given
        QuadrilateralLogic quadrilateralLogic = new QuadrilateralLogic();
        Point pointA = new Point(2,3);
        Point pointB = new Point(3,5);
        Point pointC = new Point(4,7);
        Point pointD = new Point(5,9);

        //when
        double actual = quadrilateralLogic.calculatePerimeter(pointA, pointB, pointC, pointD);

        //then
        Assert.assertEquals(13.416,actual,DELTA);
    }

    @Test
    public void testCalculatePerimeterShouldCalculatePerimeterWhenDiNumbersApplied() {
        //given
        QuadrilateralLogic quadrilateralLogic = new QuadrilateralLogic();
        Point pointA = new Point(2,3);
        Point pointB = new Point(3,5);
        Point pointC = new Point(4,7);
        Point pointD = new Point(5,9);

        //when
        double actual = quadrilateralLogic.calculatePerimeter(pointA, pointB, pointC, pointD);

        //then
        Assert.assertEquals(13.416,actual,DELTA);
    }

    @Test
    public void testDefineTypeShouldReturnSquareWhenDiNumbersApplied() {
        //given
        QuadrilateralLogic quadrilateralLogic = new QuadrilateralLogic();
        Point pointA = new Point(2,3);
        Point pointB = new Point(3,3);
        Point pointC = new Point(3,2);
        Point pointD = new Point(2,2);

        //when
        String actual = quadrilateralLogic.defineType(pointA, pointB, pointC, pointD);

        //then
        Assert.assertEquals("square",actual);
    }

    @Test
    public void testDefineTypeShouldReturnRhombusWhenDiNumbersApplied() {
        //given
        QuadrilateralLogic quadrilateralLogic = new QuadrilateralLogic();
        Point pointA = new Point(4,6);
        Point pointB = new Point(6,2);
        Point pointC = new Point(8,6);
        Point pointD = new Point(6,10);

        //when
        String actual = quadrilateralLogic.defineType(pointA, pointB, pointC, pointD);

        //then
        Assert.assertEquals("rhombus",actual);
    }

    @Test
    public void testDefineTypeShouldReturnRectangleWhenDiNumbersApplied() {
        //given
        QuadrilateralLogic quadrilateralLogic = new QuadrilateralLogic();
        Point pointA = new Point(1,5);
        Point pointB = new Point(5,5);
        Point pointC = new Point(5,2);
        Point pointD = new Point(1,2);

        //when
        String actual = quadrilateralLogic.defineType(pointA, pointB, pointC, pointD);

        //then
        Assert.assertEquals("rectangle",actual);
    }

    @Test
    public void testDefineTypeShouldReturnTrapezoidWhenDiNumbersApplied() {
        //given
        QuadrilateralLogic quadrilateralLogic = new QuadrilateralLogic();
        Point pointA = new Point(1,1);
        Point pointB = new Point(2,3);
        Point pointC = new Point(4,4);
        Point pointD = new Point(1,4);

        //when
        String actual = quadrilateralLogic.defineType(pointA, pointB, pointC, pointD);

        //then
        Assert.assertEquals("trapezoid",actual);
    }

    @Test
    public void testDefineTypeShouldReturnArbitraryWhenDiNumbersApplied() {
        //given
        QuadrilateralLogic quadrilateralLogic = new QuadrilateralLogic();
        Point pointA = new Point(1,1);
        Point pointB = new Point(2,3);
        Point pointC = new Point(4,3);
        Point pointD = new Point(3,1);

        //when
        String actual = quadrilateralLogic.defineType(pointA, pointB, pointC, pointD);

        //then
        Assert.assertEquals("arbitrary",actual);
    }

    @Test
    public void testCalculateAreaShouldCalculateSquareWhenDifferentNumbersApplied() {
        //given
        QuadrilateralLogic quadrilateralLogic = new QuadrilateralLogic();
        Point pointA = new Point(2,3);
        Point pointB = new Point(3,3);
        Point pointC = new Point(3,2);
        Point pointD = new Point(2,2);
        String type = quadrilateralLogic.defineType(pointA, pointB, pointC, pointD);

        //when
        double actual = quadrilateralLogic.calculateArea(pointA, pointB, pointC, pointD, type);

        //then
        Assert.assertEquals(1,actual,DELTA);
    }

    @Test
    public void testCalculateAreaShouldCalculateRhombusWhenDifferentNumbersApplied() {
        //given
        QuadrilateralLogic quadrilateralLogic = new QuadrilateralLogic();
        Point pointA = new Point(4,6);
        Point pointB = new Point(6,2);
        Point pointC = new Point(8,6);
        Point pointD = new Point(6,10);
        String type = quadrilateralLogic.defineType(pointA, pointB, pointC, pointD);

        //when
        double actual = quadrilateralLogic.calculateArea(pointA, pointB, pointC, pointD, type);

        //then
        Assert.assertEquals(16,actual,DELTA);
    }

    @Test
    public void testCalculateAreaShouldCalculateRectangleWhenDifferentNumbersApplied() {
        //given
        QuadrilateralLogic quadrilateralLogic = new QuadrilateralLogic();
        Point pointA = new Point(1,5);
        Point pointB = new Point(5,5);
        Point pointC = new Point(5,2);
        Point pointD = new Point(1,2);
        String type = quadrilateralLogic.defineType(pointA, pointB, pointC, pointD);

        //when
        double actual = quadrilateralLogic.calculateArea(pointA, pointB, pointC, pointD, type);

        //then
        Assert.assertEquals(12,actual,DELTA);
    }

    @Test
    public void testCalculateAreaShouldCalculateTrapezoidWhenDifferentNumbersApplied() {
        //given
        QuadrilateralLogic quadrilateralLogic = new QuadrilateralLogic();
        Point pointA = new Point(1,1);
        Point pointB = new Point(2,3);
        Point pointC = new Point(3,3);
        Point pointD = new Point(4,1);
        String type = quadrilateralLogic.defineType(pointA, pointB, pointC, pointD);

        //when
        double actual = quadrilateralLogic.calculateArea(pointA, pointB, pointC, pointD, type);

        //then
        Assert.assertEquals(4,actual,DELTA);
    }

    @Test
    public void testCalculateAreaShouldCalculateArbitraryWhenDifferentNumbersApplied() {
        //given
        QuadrilateralLogic quadrilateralLogic = new QuadrilateralLogic();
        Point pointA = new Point(1,1);
        Point pointB = new Point(2,3);
        Point pointC = new Point(4,3);
        Point pointD = new Point(3,1);
        String type = quadrilateralLogic.defineType(pointA, pointB, pointC, pointD);

        //when
        double actual = quadrilateralLogic.calculateArea(pointA, pointB, pointC, pointD, type);

        //then
        Assert.assertEquals(4.472,actual,DELTA);
    }

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

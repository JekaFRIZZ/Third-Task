package com.epam.task.third.calculation;

import com.epam.task.third.entities.Point;
import com.epam.task.third.entities.Quadrilateral;
import org.junit.Assert;
import org.junit.Test;

public class QuadrilateralCalculatorTest {

    private final double DELTA = 0.001;

    @Test
    public void testCalculateSideShouldCalculateWhenSameNumbersApplied() {
        //given
        QuadrilateralCalculator quadrilateralCalculation = new QuadrilateralCalculator();
        Point pointA = new Point(2,3);
        Point pointB = new Point(2,3);

        //when
        double actual = quadrilateralCalculation.calculateSide(pointA, pointB);

        //then
        Assert.assertEquals(0,actual,DELTA);
    }

    @Test
    public void testCalculateSideShouldCalculateWhenXSameYDifferent() {
        //given
        QuadrilateralCalculator quadrilateralCalculation = new QuadrilateralCalculator();
        Point pointA = new Point(2,3);
        Point pointB = new Point(2,5);

        //when
        double actual = quadrilateralCalculation.calculateSide(pointA, pointB);

        //then
        Assert.assertEquals(2,actual,DELTA);
    }

    @Test
    public void testCalculateSideShouldCalculateWhenDiNumbersApplied() {
        //given
        QuadrilateralCalculator quadrilateralCalculation = new QuadrilateralCalculator();
        Point pointA = new Point(2,3);
        Point pointB = new Point(3,5);

        //when
        double actual = quadrilateralCalculation.calculateSide(pointA, pointB);

        //then
        Assert.assertEquals(Math.sqrt(5),actual,DELTA);
    }

    @Test
    public void testCalculatePerimeterShouldCalculatePerimeterWhenDifferentNumbersApplied() {
        //given
        QuadrilateralCalculator quadrilateralCalculation = new QuadrilateralCalculator();
        Point pointA = new Point(2,3);
        Point pointB = new Point(3,5);
        Point pointC = new Point(4,7);
        Point pointD = new Point(5,9);
        Quadrilateral quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);

        //when
        double actual = quadrilateralCalculation.calculatePerimeter(quadrilateral);

        //then
        Assert.assertEquals(13.416,actual,DELTA);
    }

    @Test
    public void testCalculatePerimeterShouldCalculatePerimeterWhenDiNumbersApplied() {
        //given
        QuadrilateralCalculator quadrilateralCalculation = new QuadrilateralCalculator();
        Point pointA = new Point(2,3);
        Point pointB = new Point(3,5);
        Point pointC = new Point(4,7);
        Point pointD = new Point(5,9);
        Quadrilateral quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);

        //when
        double actual = quadrilateralCalculation.calculatePerimeter(quadrilateral);

        //then
        Assert.assertEquals(13.416,actual,DELTA);
    }

    @Test
    public void testDefineTypeShouldReturnSquareWhenDiNumbersApplied() {
        //given
        QuadrilateralCalculator quadrilateralCalculation = new QuadrilateralCalculator();
        Point pointA = new Point(2,3);
        Point pointB = new Point(3,3);
        Point pointC = new Point(3,2);
        Point pointD = new Point(2,2);
        Quadrilateral quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);

        //when
        String actual = quadrilateralCalculation.defineType(quadrilateral);

        //then
        Assert.assertEquals("square",actual);
    }

    @Test
    public void testDefineTypeShouldReturnRhombusWhenDiNumbersApplied() {
        //given
        QuadrilateralCalculator quadrilateralCalculation = new QuadrilateralCalculator();
        Point pointA = new Point(4,6);
        Point pointB = new Point(6,2);
        Point pointC = new Point(8,6);
        Point pointD = new Point(6,10);
        Quadrilateral quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);

        //when
        String actual = quadrilateralCalculation.defineType(quadrilateral);

        //then
        Assert.assertEquals("rhombus",actual);
    }

    @Test
    public void testDefineTypeShouldReturnRectangleWhenDiNumbersApplied() {
        //given
        QuadrilateralCalculator quadrilateralCalculation = new QuadrilateralCalculator();
        Point pointA = new Point(1,5);
        Point pointB = new Point(5,5);
        Point pointC = new Point(5,2);
        Point pointD = new Point(1,2);
        Quadrilateral quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);

        //when
        String actual = quadrilateralCalculation.defineType(quadrilateral);

        //then
        Assert.assertEquals("rectangle",actual);
    }

    @Test
    public void testDefineTypeShouldReturnTrapezoidWhenDiNumbersApplied() {
        //given
        QuadrilateralCalculator quadrilateralCalculation = new QuadrilateralCalculator();
        Point pointA = new Point(1,1);
        Point pointB = new Point(2,3);
        Point pointC = new Point(4,4);
        Point pointD = new Point(1,4);
        Quadrilateral quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);

        //when
        String actual = quadrilateralCalculation.defineType(quadrilateral);

        //then
        Assert.assertEquals("trapezoid",actual);
    }

    @Test
    public void testDefineTypeShouldReturnArbitraryWhenDiNumbersApplied() {
        //given
        QuadrilateralCalculator quadrilateralCalculation = new QuadrilateralCalculator();
        Point pointA = new Point(1,1);
        Point pointB = new Point(2,3);
        Point pointC = new Point(4,3);
        Point pointD = new Point(3,1);
        Quadrilateral quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);

        //when
        String actual = quadrilateralCalculation.defineType(quadrilateral);

        //then
        Assert.assertEquals("arbitrary",actual);
    }

    @Test
    public void testCalculateAreaShouldCalculateSquareWhenDifferentNumbersApplied() {
        //given
        QuadrilateralCalculator quadrilateralCalculation = new QuadrilateralCalculator();
        Point pointA = new Point(2,3);
        Point pointB = new Point(3,3);
        Point pointC = new Point(3,2);
        Point pointD = new Point(2,2);
        Quadrilateral quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);
        String type = quadrilateralCalculation.defineType(quadrilateral);

        //when
        double actual = quadrilateralCalculation.calculateArea(quadrilateral, type);

        //then
        Assert.assertEquals(1,actual,DELTA);
    }

    @Test
    public void testCalculateAreaShouldCalculateRhombusWhenDifferentNumbersApplied() {
        //given
        QuadrilateralCalculator quadrilateralCalculation = new QuadrilateralCalculator();
        Point pointA = new Point(4,6);
        Point pointB = new Point(6,2);
        Point pointC = new Point(8,6);
        Point pointD = new Point(6,10);
        Quadrilateral quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);
        String type = quadrilateralCalculation.defineType(quadrilateral);

        //when
        double actual = quadrilateralCalculation.calculateArea(quadrilateral, type);

        //then
        Assert.assertEquals(16,actual,DELTA);
    }

    @Test
    public void testCalculateAreaShouldCalculateRectangleWhenDifferentNumbersApplied() {
        //given
        QuadrilateralCalculator quadrilateralCalculation = new QuadrilateralCalculator();
        Point pointA = new Point(1,5);
        Point pointB = new Point(5,5);
        Point pointC = new Point(5,2);
        Point pointD = new Point(1,2);
        Quadrilateral quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);
        String type = quadrilateralCalculation.defineType(quadrilateral);

        //when
        double actual = quadrilateralCalculation.calculateArea(quadrilateral, type);

        //then
        Assert.assertEquals(12,actual,DELTA);
    }

    @Test
    public void testCalculateAreaShouldCalculateTrapezoidWhenDifferentNumbersApplied() {
        //given
        QuadrilateralCalculator quadrilateralCalculation = new QuadrilateralCalculator();
        Point pointA = new Point(1,1);
        Point pointB = new Point(2,3);
        Point pointC = new Point(3,3);
        Point pointD = new Point(4,1);
        Quadrilateral quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);
        String type = quadrilateralCalculation.defineType(quadrilateral);

        //when
        double actual = quadrilateralCalculation.calculateArea(quadrilateral, type);

        //then
        Assert.assertEquals(4,actual,DELTA);
    }

    @Test
    public void testCalculateAreaShouldCalculateArbitraryWhenDifferentNumbersApplied() {
        //given
        QuadrilateralCalculator quadrilateralCalculation = new QuadrilateralCalculator();
        Point pointA = new Point(1,1);
        Point pointB = new Point(2,3);
        Point pointC = new Point(4,3);
        Point pointD = new Point(3,1);
        Quadrilateral quadrilateral = new Quadrilateral(pointA, pointB, pointC, pointD);
        String type = quadrilateralCalculation.defineType(quadrilateral);

        //when
        double actual = quadrilateralCalculation.calculateArea(quadrilateral, type);

        //then
        Assert.assertEquals(4.472,actual,DELTA);
    }

}

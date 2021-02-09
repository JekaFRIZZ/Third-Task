package com.epam.task.third.logic;

import com.epam.task.third.entities.Point;

public class QuadrilateralLogic {

    public double calculateSide(Point pointA, Point pointB) {

        double pointAX = pointA.getX();
        double pointAY = pointA.getY();

        double pointBX = pointB.getX();
        double pointBY = pointB.getY();

        return Math.hypot(pointAX - pointBX, pointAY - pointBY);
    }

    public double calculatePerimeter(Point pointA, Point pointB, Point pointC, Point pointD) {

        double sideA = calculateSide(pointA, pointB);
        double sideB = calculateSide(pointB, pointC);
        double sideC = calculateSide(pointC, pointD);
        double sideD = calculateSide(pointD, pointA);

        return sideA + sideB + sideC + sideD;
    }

    public String defineType(Point pointA, Point pointB, Point pointC, Point pointD) {

        double sideA = calculateSide(pointA, pointB);
        double sideB = calculateSide(pointB, pointC);
        double sideC = calculateSide(pointC, pointD);
        double sideD = calculateSide(pointD, pointA);

        double diagonalAC = calculateSide(pointA, pointC);
        double diagonalBD = calculateSide(pointB, pointD);

        if(sideA == sideC && sideB == sideD) {
            if (sideA == sideB) {
                if (diagonalAC == diagonalBD) {
                    return "square";
                } else {
                    return "rhombus";
                }
            } else {
                if (diagonalAC == diagonalBD) {
                    return "rectangle";
                }
            }
        }
        else {
            if(sideA + sideC == sideB + sideD) {
                return "trapezoid";
            }
        }
        return "arbitrary";
    }

    public double calculateArea(Point pointA, Point pointB, Point pointC, Point pointD, String type) {

        double sideA = calculateSide(pointA, pointB);
        double sideB = calculateSide(pointB, pointC);
        double sideC = calculateSide(pointC, pointD);
        double sideD = calculateSide(pointD, pointA);

        double diagonalAC = calculateSide(pointA, pointC);
        double diagonalBD = calculateSide(pointB, pointD);

        double semiPerimeter = (sideA + sideB + sideC + sideD) / 2;

        double pointAY = pointA.getY();
        double pointBY = pointB.getY();
        
        double area = 0;
        switch (type) {
            case "square": area = Math.pow(sideA, 2);
            break;
            case "rhombus": area = 0.5 * diagonalAC * diagonalBD;
            break;
            case "rectangle":area = sideA * sideB;
            break;
            case "trapezoid":area = ((sideB + sideD) / 2) * Math.abs(pointAY - pointBY);
            break;
            case "arbitrary":area = Math.sqrt((semiPerimeter - sideA) * (semiPerimeter - sideB) *
                        (semiPerimeter - sideC) * (semiPerimeter - sideD));
            default:
                 new IllegalArgumentException();
        }
        return area;
    }

    public boolean isQuadrilateral(Point pointA, Point pointB, Point pointC, Point pointD) {

        double pointAX = pointA.getX();
        double pointAY = pointA.getY();

        double pointBX = pointB.getX();
        double pointBY = pointB.getY();

        double pointCX = pointC.getX();
        double pointCY = pointC.getY();

        double pointDX = pointD.getX();
        double pointDY = pointD.getY();

        if((pointCX - pointAX) / (pointBX - pointAX) != (pointCY - pointAY) / (pointBY - pointAY)) {
            return true;
        }
        else {
            if((pointDX - pointCX) / (pointBX - pointCX) != (pointDY - pointCY) / (pointBY - pointCY)) {
                return true;
            }
            return false;
        }
    }
}

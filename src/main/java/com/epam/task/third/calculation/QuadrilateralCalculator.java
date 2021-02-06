package com.epam.task.third.calculation;

import com.epam.task.third.entities.Point;
import com.epam.task.third.entities.Quadrilateral;

import java.util.ArrayList;
import java.util.List;

public class QuadrilateralCalculator {

    public double calculateSide(Point pointA, Point pointB) {

        double pointAX = pointA.getX();
        double pointAY = pointA.getY();

        double pointBX = pointB.getX();
        double pointBY = pointB.getY();

        return Math.hypot(pointAX - pointBX, pointAY - pointBY);
    }

    private List<Double> calculateSides(Point... points) {

        List<Double> sides = new ArrayList<>();

        sides.add(calculateSide(points[0], points[1]));
        sides.add(calculateSide(points[1], points[2]));
        sides.add(calculateSide(points[2], points[3]));
        sides.add(calculateSide(points[3], points[0]));

        return sides;
    }

    public double calculatePerimeter(Quadrilateral quadrilateral) {

        List<Point> points = quadrilateral.getElements();
        List<Double> sides = calculateSides(points.get(0), points.get(1), points.get(2), points.get(3));
        double summary = 0;

        for (Double side : sides) {
            summary += side;
        }
        return summary;
    }

    public String defineType(Quadrilateral quadrilateral) {

        List<Point> points = quadrilateral.getElements();
        List<Double> sides = calculateSides(points.get(0), points.get(1), points.get(2), points.get(3));

        double sideA = sides.get(0);
        double sideB = sides.get(1);
        double sideC = sides.get(2);
        double sideD = sides.get(3);

        double diagonalAC = calculateSide(points.get(0), points.get(2));
        double diagonalBD = calculateSide(points.get(1), points.get(3));

        if (sideA == sideC && sideB == sideD) {
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
        } else {
            if (sideA + sideC == sideB + sideD) {
                return "trapezoid";
            }
        }
        return "arbitrary";
    }

    public double calculateArea(Quadrilateral quadrilateral, String type) {

        List<Point> points = quadrilateral.getElements();
        List<Double> sides = calculateSides(points.get(0), points.get(1), points.get(2), points.get(3));

        double sideA = sides.get(0);
        double sideB = sides.get(1);
        double sideC = sides.get(2);
        double sideD = sides.get(3);

        double diagonalAC = calculateSide(points.get(0), points.get(2));
        double diagonalBD = calculateSide(points.get(1), points.get(3));

        double semiPerimeter = (sideA + sideB + sideC + sideD) / 2;

        double pointAY = points.get(0).getY();
        double pointBY = points.get(1).getY();

        double area = 0;
        switch (type) {
            case "square":
                area = Math.pow(sideA, 2);
                break;
            case "rhombus":
                area = 0.5 * diagonalAC * diagonalBD;
                break;
            case "rectangle":
                area = sideA * sideB;
                break;
            case "trapezoid":
                area = ((sideB + sideD) / 2) * Math.abs(pointAY - pointBY);
                break;
            case "arbitrary":
                area = Math.sqrt((semiPerimeter - sideA) * (semiPerimeter - sideB) *
                        (semiPerimeter - sideC) * (semiPerimeter - sideD));
            default:
                throw new IllegalArgumentException();
        }
        return area;
    }
}

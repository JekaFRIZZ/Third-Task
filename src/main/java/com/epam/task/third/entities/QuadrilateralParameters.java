package com.epam.task.third.entities;

import java.util.Objects;

public class QuadrilateralParameters {
    private double area;
    private double perimeter;

    public QuadrilateralParameters(double area, double perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuadrilateralParameters that = (QuadrilateralParameters) o;
        return Double.compare(that.area, area) == 0 && Double.compare(that.perimeter, perimeter) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, perimeter);
    }
}

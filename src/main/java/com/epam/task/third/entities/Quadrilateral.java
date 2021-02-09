package com.epam.task.third.entities;

import java.util.*;

public class Quadrilateral {

    private QuadrilateralParameters parameters;
    private final List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public Quadrilateral(Point...points) {
        this.points = new ArrayList<>();
        for(Point point :points) {
            this.points.add(point);
        }
    }

    public int getId() {
        return this.hashCode();
    }

    public Quadrilateral(List<Point> points) {
        this.points = points;
    }
    public List<Point> getElements() {
        return points;
    }

    public void add(Point point) {
        points.add(point);
    }

    public QuadrilateralParameters getParameters() {
        return parameters;
    }

    public void setParameters(QuadrilateralParameters parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Quadrilateral that = (Quadrilateral) o;
        return Objects.equals(points, that.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }

    @Override
    public String toString() {
        return "Quadrilateral{" +
                "points=" + points +
                '}';
    }
}

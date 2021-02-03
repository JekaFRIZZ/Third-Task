package com.epam.task.third.entities;

import java.util.*;

public class Quadrilateral {

    List<Point> points;

    public Quadrilateral(Point...points) {
        this.points = new ArrayList<>();
        for(Point point :points) {
            this.points.add(point);
        }
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

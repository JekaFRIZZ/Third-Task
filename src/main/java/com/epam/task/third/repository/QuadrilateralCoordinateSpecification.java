package com.epam.task.third.repository;

import com.epam.task.third.entities.Point;
import com.epam.task.third.entities.Quadrilateral;

import java.util.List;

public class QuadrilateralCoordinateSpecification implements QuadrilateralSpecification {
    @Override
    public boolean specified(Quadrilateral quadrilateral) {
        List<Point> points = quadrilateral.getElements();

        for(Point point: points) {
            double pointX = point.getX();
            if(pointX < 0) {
                return false;
            }
        }
        return true;
    }
}

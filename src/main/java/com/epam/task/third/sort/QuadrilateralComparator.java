package com.epam.task.third.sort;

import com.epam.task.third.entities.Quadrilateral;

import java.util.Comparator;

public interface QuadrilateralComparator extends Comparator<Quadrilateral> {
    @Override
    int compare(Quadrilateral firstQuadrilateral, Quadrilateral secondQuadrilateral);
}

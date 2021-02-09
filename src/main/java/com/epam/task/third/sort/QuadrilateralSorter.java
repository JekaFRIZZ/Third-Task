package com.epam.task.third.sort;

import com.epam.task.third.entities.Quadrilateral;

import java.util.List;

public class QuadrilateralSorter {
    public void sort(List<Quadrilateral> quadrilaterals, QuadrilateralComparator comparator) {
        quadrilaterals.sort(comparator);
    }
}

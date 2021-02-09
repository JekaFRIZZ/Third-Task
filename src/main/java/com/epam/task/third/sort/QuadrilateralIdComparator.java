package com.epam.task.third.sort;

import com.epam.task.third.entities.Quadrilateral;

public class QuadrilateralIdComparator implements QuadrilateralComparator {
    @Override
    public int compare(Quadrilateral firstQuadrilateral, Quadrilateral secondQuadrilateral) {
        Integer firstId = firstQuadrilateral.getId();
        Integer secondId = secondQuadrilateral.getId();
        return firstId.compareTo(secondId);
    }
}

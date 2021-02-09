package com.epam.task.third.sort;

import com.epam.task.third.entities.Quadrilateral;

public class QuadrilateralAreaComparator  implements QuadrilateralComparator {
    @Override
    public int compare(Quadrilateral firstQuadrilateral, Quadrilateral secondQuadrilateral) {
        Double firstArea = firstQuadrilateral.getParameters().getArea();
        Double secondArea = secondQuadrilateral.getParameters().getArea();
        return firstArea.compareTo(secondArea);
    }
}

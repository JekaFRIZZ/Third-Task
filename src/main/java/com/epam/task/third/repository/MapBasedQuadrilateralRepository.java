package com.epam.task.third.repository;

import com.epam.task.third.entities.Quadrilateral;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapBasedQuadrilateralRepository implements QuadrilateralRepository{
    Map<Integer, Quadrilateral> map = new HashMap<>();

    @Override
    public void addQuadrilateral(Quadrilateral quadrilateral) {
        int id = quadrilateral.getId();
        map.put(id, quadrilateral);
    }

    @Override
    public void removeQuadrilateral(Quadrilateral quadrilateral) {
        int id = quadrilateral.getId();
        map.remove(id, quadrilateral);
    }

    @Override
    public void updateQuadrilateral(Quadrilateral quadrilateral) {
        int id = quadrilateral.getId();
        Quadrilateral newQuadrilateral = map.get(id);
        double newPerimeter = quadrilateral.getParameters().getPerimeter();
        newQuadrilateral.getParameters().setPerimeter(newPerimeter);
    }

    @Override
    public List<Quadrilateral> query(QuadrilateralSpecification specification) {
        List<Quadrilateral> quadrilaterals = new ArrayList<>();
        for(Quadrilateral quadrilateral: map.values()) {
            if(specification.specified(quadrilateral)) {
                quadrilaterals.add(quadrilateral);
            }
        }
        return quadrilaterals;
    }
}

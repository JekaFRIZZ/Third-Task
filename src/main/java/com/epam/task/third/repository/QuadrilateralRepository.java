package com.epam.task.third.repository;

import com.epam.task.third.entities.Quadrilateral;

import java.util.List;

public interface QuadrilateralRepository {
    void addQuadrilateral(Quadrilateral quadrilateral);
    void removeQuadrilateral(Quadrilateral quadrilateral);
    void updateQuadrilateral(Quadrilateral quadrilateral);

    List<Quadrilateral> query(QuadrilateralSpecification specification);
}

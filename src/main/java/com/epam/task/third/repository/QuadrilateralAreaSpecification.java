package com.epam.task.third.repository;

import com.epam.task.third.calculation.QuadrilateralCalculator;
import com.epam.task.third.entities.Quadrilateral;

public class QuadrilateralAreaSpecification implements QuadrilateralSpecification{

    private QuadrilateralCalculator calculator;
    private double from;
    private double to;

    public QuadrilateralAreaSpecification(double from, double to) {
        this.calculator = new QuadrilateralCalculator();
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean specified(Quadrilateral quadrilateral) {
        String type = calculator.defineType(quadrilateral);
        double area = calculator.calculateArea(quadrilateral, type);
        return area >= from && area <= to;
    }
}

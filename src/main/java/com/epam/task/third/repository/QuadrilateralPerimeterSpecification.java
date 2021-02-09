package com.epam.task.third.repository;

import com.epam.task.third.calculation.QuadrilateralCalculator;
import com.epam.task.third.entities.Quadrilateral;

public class QuadrilateralPerimeterSpecification implements QuadrilateralSpecification {

    private QuadrilateralCalculator calculator;
    private double from;
    private double to;

    public QuadrilateralPerimeterSpecification(double from, double to) {
        this.calculator = new QuadrilateralCalculator();
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean specified(Quadrilateral quadrilateral) {
        double perimeter = calculator.calculatePerimeter(quadrilateral);
        return perimeter >= from && perimeter <= to;
    }
}

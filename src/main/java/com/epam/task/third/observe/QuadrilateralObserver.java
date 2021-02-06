package com.epam.task.third.observe;

import com.epam.task.third.calculation.QuadrilateralCalculator;
import com.epam.task.third.entities.Quadrilateral;
import com.epam.task.third.entities.QuadrilateralParameters;
import com.epam.task.third.observe.Observer;

import java.util.EventObject;
import java.util.HashMap;
import java.util.Map;

public class QuadrilateralObserver implements Observer{

    private final static QuadrilateralObserver INSTANCE = new QuadrilateralObserver();
    private QuadrilateralObserver(){}
    public static QuadrilateralObserver getInstance(){
        return INSTANCE;
    }

    Map<Integer, QuadrilateralParameters> observableQuadrilateral = new HashMap<>();

    private QuadrilateralCalculator calculator;
    private Quadrilateral quadrilateral;

    @Override
    public void update(Quadrilateral quadrilateral) {
        double area = calculator.calculateArea(quadrilateral, calculator.defineType(quadrilateral));
        double perimeter = calculator.calculatePerimeter(quadrilateral);
        QuadrilateralParameters parameters = new QuadrilateralParameters(area, perimeter);
    }

    @Override
    public void addObservable() {
        double area = calculator.calculateArea(quadrilateral, calculator.defineType(quadrilateral));
        double perimeter = calculator.calculatePerimeter(quadrilateral);
        QuadrilateralParameters quadrilateralParameters = new QuadrilateralParameters(area, perimeter);
        int id = quadrilateral.getId();
        observableQuadrilateral.put(id, quadrilateralParameters);
    }

    @Override
    public void deleteObservable() {
        int id = quadrilateral.getId();
        observableQuadrilateral.remove(id);
    }

    public QuadrilateralParameters getQuadrilateralParameters(Quadrilateral quadrilateral) {
        int id = quadrilateral.getId();
        return observableQuadrilateral.get(id);
    }
}

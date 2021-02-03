package com.epam.task.third;

import com.epam.task.third.creator.PointParser;
import com.epam.task.third.creator.PointValidator;
import com.epam.task.third.data.DataException;
import com.epam.task.third.data.DataReader;
import com.epam.task.third.entities.Point;
import com.epam.task.third.entities.Quadrilateral;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QuadrilateralCreator {

    private final static String DELIMITER = " ";

    private DataReader dataReader;
    private PointValidator validator;
    private PointParser parser;

    public QuadrilateralCreator(final DataReader dataReader, final PointValidator validator, final PointParser parser) {
        this.dataReader = dataReader;
        this.validator = validator;
        this.parser = parser;
    }

    public Quadrilateral process(String filename) throws DataException {
        List<String> data = dataReader.readDate(filename);
        List<Point> points = new ArrayList<>();

        for(String line : data) {
            if (validator.validate(line)) {
                Point point = parser.parse(line);
                points.add(point);
            }
        }
        return new Quadrilateral(points);
    }
}

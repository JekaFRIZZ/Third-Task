package com.epam.task.third.creator;

import com.epam.task.third.entities.Point;

public class PointParser {

    private final static String DELIMITER = " ";

    public Point parse(String data) {
        String[] elements = data.split(DELIMITER);

        int x = Integer.parseInt(elements[0]);
        int y = Integer.parseInt(elements[1]);

        return new Point(x, y);
    }

}

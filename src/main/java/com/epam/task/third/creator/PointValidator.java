package com.epam.task.third.creator;

public class PointValidator {

    private final static String QUADRILATERAL_PATTERN = "^\\d+\\.\\d+\\s+\\d+\\.\\d+$";

    public boolean validate(String line) {
        return line.matches(QUADRILATERAL_PATTERN);
    }

}

package com.epam.task.third.creator;

public class PointValidator {

    private final static String TRIANGLE_PATTERN = "^\\d.+\\s+\\d.+$";

    public boolean validate(String line) {
        return line.matches(TRIANGLE_PATTERN);
    }

}

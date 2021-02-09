package com.epam.task.third.creator;

import org.junit.Assert;
import org.junit.Test;

public class PointValidatorTest {

    @Test
    public void testValidateWhenCorrectStringApplied() {
        //given
        PointValidator pointValidator = new PointValidator();

        //when
        boolean actual = pointValidator.validate("1  2.5");

        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testValidateShouldValidateWhenOneCharApplied() {
        //given
        PointValidator pointValidator = new PointValidator();

        //when
        boolean actual = pointValidator.validate("1");

        //then
        Assert.assertFalse(actual);
    }

    @Test
    public void testValidateShouldValidateWhenEmptyStringApplied() {
        //given
        PointValidator pointValidator = new PointValidator();

        //when
        boolean actual = pointValidator.validate("");

        //then
        Assert.assertFalse(actual);
    }

    @Test
    public void testValidateShouldValidateWhenIncorrectStringApplied() {
        //given
        PointValidator pointValidator = new PointValidator();

        //when
        boolean actual = pointValidator.validate("1F 2");

        //then
        Assert.assertFalse(actual);
    }

    @Test
    public void testValidateShouldValidateWhenIncorrectSplitApplied() {
        //given
        PointValidator pointValidator = new PointValidator();

        //when
        boolean actual = pointValidator.validate("  1    2");

        //then
        Assert.assertFalse(actual);
    }
}

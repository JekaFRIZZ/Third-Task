package com.epam.task.third.sort;

import com.epam.task.third.entities.Point;
import com.epam.task.third.entities.Quadrilateral;
import org.junit.Assert;
import org.junit.Test;

public class QuadrilateralIdComparatorTest {

    private final Quadrilateral FIRST_QUADRILATERAL = new Quadrilateral(new Point(2,3),new Point(3,3),
            new Point(3,2),new Point(2,2));
    private final Quadrilateral SECOND_QUADRILATERAL = new Quadrilateral(new Point(1,1),new Point(2,3),
            new Point(4,4),new Point(1,4));

    @Test
    public void testCompareShouldReturnMinusOneWhenDifferentQuadrilateralsApplied() {
        //given
        QuadrilateralComparator comparator = new QuadrilateralIdComparator();
        //when
        int actual = comparator.compare(FIRST_QUADRILATERAL, SECOND_QUADRILATERAL);
        //then
        Assert.assertEquals(-1,actual);
    }
}

package com.epam.task.third.logic;

import com.epam.task.third.entities.Point;

public class QuadrilateralLogic {

    public boolean isQuadrilateral(Point pointA, Point pointB, Point pointC, Point pointD) {

        double pointAX = pointA.getX();
        double pointAY = pointA.getY();

        double pointBX = pointB.getX();
        double pointBY = pointB.getY();

        double pointCX = pointC.getX();
        double pointCY = pointC.getY();

        double pointDX = pointD.getX();
        double pointDY = pointD.getY();

        if((pointCX - pointAX) / (pointBX - pointAX) != (pointCY - pointAY) / (pointBY - pointAY)) {
            return true;
        }
        else {
            return (pointDX - pointCX) / (pointBX - pointCX) != (pointDY - pointCY) / (pointBY - pointCY);

        }
    }
}

package com.cxq.generic;

import org.junit.Test;

/**
 * @author CXQ
 * @version 1.0
 */
public class PointWithGenericTypeTest {

    private static class PointDemo<E> {
        private E x;
        private E y;

        private E getX() {
            return x;
        }
        private void setX(E x) {
            this.x = x;
        }
        private E getY() {
            return y;
        }
        private void setY(E y) {
            this.y = y;
        }
    }

    @Test
    public void pointDemo() {
        PointDemo<Integer> integerPoint = new PointDemo<>();
        integerPoint.setX(10);
        integerPoint.setY(20);
        System.out.println(integerPoint.getX() + " : " + integerPoint.getY());

        PointDemo<Double> doublePoint = new PointDemo<>();
        doublePoint.setX(10.5);
        doublePoint.setY(20.5);
        System.out.println(doublePoint.getX() + " : " + doublePoint.getY());

        PointDemo<String> stringPoint = new PointDemo<>();
        stringPoint.setX("东经108°25′");
        stringPoint.setY("东经108°25′");
        System.out.println(stringPoint.getX() + " : " + stringPoint.getY());
    }
}

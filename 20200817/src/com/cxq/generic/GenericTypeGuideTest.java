package com.cxq.generic;

import org.junit.Test;

/**
 * @author CXQ
 * @version 1.0
 */
public class GenericTypeGuideTest {
    static class PointDemo {
        private Integer integerX;
        private Integer integerY;

        public Integer getIntegerY() {
            return integerY;
        }
        public void setIntegerY(Integer integerY) {
            this.integerY = integerY;
        }
        public Integer getIntegerX() {
            return integerX;
        }
        public void setIntegerX(Integer integerX) {
            this.integerX = integerX;
        }

        private Double DoubleX;
        private Double DoubleY;

        public Double getDoubleX() {
            return DoubleX;
        }
        public void setDoubleX(Double doubleX) {
            DoubleX = doubleX;
        }
        public Double getDoubleY() {
            return DoubleY;
        }
        public void setDoubleY(Double doubleY) {
            DoubleY = doubleY;
        }

        private String StringX;
        private String StringY;

        public String getStringX() {
            return StringX;
        }
        public void setStringX(String stringX) {
            StringX = stringX;
        }
        public String getStringY() {
            return StringY;
        }
        public void setStringY(String stringY) {
            StringY = stringY;
        }
    }

    @Test
    public void pointDemo() {
        PointDemo point = new PointDemo();
        point.setIntegerX(10);
        point.setIntegerY(20);
        System.out.println(point.getIntegerX() + " : " + point.getIntegerY());

        point.setDoubleX(10.5);
        point.setDoubleY(20.5);
        System.out.println(point.getDoubleX() + " : " + point.getDoubleY());

        point.setStringX("东经108°25′");
        point.setStringY("东经108°25′");
        System.out.println(point.getStringX() + " : " + point.getStringY());
    }
}

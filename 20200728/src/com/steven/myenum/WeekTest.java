package com.steven.myenum;

import org.junit.Test;

/**
 * @author CXQ
 * @version 1.0
 */
public class WeekTest {

    @Test
    public void enumApi() {
        System.out.println(Week.MON);
        System.out.println(Week.MON.toString());
        System.out.println(Week.SAT.name());
        System.out.println(Week.FRI.ordinal());
        System.out.println(Week.TUE.compareTo(Week.TUE));
    }

    @Test
    public void enumForSwitch() {
        Week dayOfWeek = Week.SAT;
        switch (dayOfWeek) {
            case SAT:
                System.out.println("复习");
                break;
            case SUN:
                System.out.println("旅游");
                break;
            default:
                System.out.println("上课");
                break;
        }
    }
}

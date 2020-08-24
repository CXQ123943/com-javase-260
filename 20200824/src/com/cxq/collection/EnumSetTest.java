package com.cxq.collection;

import org.junit.Test;

import java.util.EnumSet;

/**
 * @author CXQ
 * @version 1.0
 */
public class EnumSetTest {

    public enum Color {
        /**
         * some color
         * */
        RED,GREEN,BIUE,BLACK,YELLOW,WHITE,PINK,GRAY;
    }

    @Test
    public void enumToSet() {
        EnumSet<Color> colors = EnumSet.allOf(Color.class);
        for (Color e: colors) {
            System.out.print(e.toString() + "\0");
        }
    }
}

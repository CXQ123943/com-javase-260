package com.cxq.reflect;

import org.junit.Test;

/**
 * @author CXQ
 * @version 1.0
 */
public class GetArrayClassTest {

    @Test
    public void arrayTypeTest() {
        Class<?> class01 = int[].class;
        Class<?> class02 = int[].class;
        Class<?> class03 = int[][].class;
        Class<?> class04 = double[].class;

        System.out.println(class01.hashCode() == class02.hashCode());
        System.out.println(class01.hashCode() == class03.hashCode());
        System.out.println(class01.hashCode() == class04.hashCode());
    }
}

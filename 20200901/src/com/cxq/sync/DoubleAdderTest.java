package com.cxq.sync;

import org.junit.Test;

import java.util.concurrent.atomic.DoubleAdder;

/**
 * @author CXQ
 * @version 1.0
 */
public class DoubleAdderTest {

    private static DoubleAdder doubleAdder = new DoubleAdder();

    @Test
    public void longAdder() {
        System.out.println("当前值：" + doubleAdder);
        doubleAdder.add(5);
        System.out.println("+5后的值：" + doubleAdder);
        doubleAdder.sum();
        System.out.println("sum后的值：" + doubleAdder);

    }
}
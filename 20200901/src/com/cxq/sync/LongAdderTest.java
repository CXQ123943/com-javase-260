package com.cxq.sync;

import org.junit.Test;

import java.util.concurrent.atomic.LongAdder;

/**
 * @author CXQ
 * @version 1.0
 */
public class LongAdderTest {

    private static LongAdder longAdder = new LongAdder();

    @Test
    public void longAdder() {
        System.out.println("当前值：" + longAdder);
        longAdder.add(5);
        System.out.println("+5后的值：" + longAdder);
        longAdder.increment();
        System.out.println("自增1后的值：" + longAdder);
        longAdder.decrement();
        System.out.println("自减1后的值：" + longAdder);
    }
}

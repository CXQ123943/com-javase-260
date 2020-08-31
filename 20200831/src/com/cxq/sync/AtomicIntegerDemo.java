package com.cxq.sync;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author CXQ
 * @version 1.0
 */
public class AtomicIntegerDemo {

    private static AtomicInteger atomicInteger = new AtomicInteger();

    public static void main(String[] args) {
        System.out.println("当前值：" + atomicInteger.get());
        System.out.println("当前值+1后：" + atomicInteger.incrementAndGet());
        System.out.println("当前值-1后：" + atomicInteger.decrementAndGet());
        System.out.println("当前值+6后：" + atomicInteger.addAndGet(6));

        int result = atomicInteger.accumulateAndGet(6, (left, right) -> {
            System.out.print("left：" + left + "\t");
            System.out.print("right：" + right + "\n");
            return left * right;
        });
        System.out.println("当前值*5后：" + result);

    }
}

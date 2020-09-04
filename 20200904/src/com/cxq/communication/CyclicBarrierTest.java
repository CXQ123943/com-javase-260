package com.cxq.communication;

import lombok.SneakyThrows;
import org.junit.After;
import org.junit.Test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author CXQ
 * @version 1.0
 */
public class CyclicBarrierTest {

    @Test
    public void cyclicBarrier() {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(8, () -> {
            System.out.println("broke the cyclicBarrier...");
        });

        synchronized (this) {
            for (int i = 0, j = 9; i < j; i++) {
                new Thread(() -> {
                    try {
                        System.out.println(Thread.currentThread().getName() + ": ready...");
                        cyclicBarrier.await();
                    } catch (BrokenBarrierException | InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ": go...");
                }, "threadA-" + i).start();
            }
        }


        synchronized (this) {
            for (int i = 0, j = 9; i < j; i++) {
                new Thread(() -> {
                    try {
                        System.out.println(Thread.currentThread().getName() + ": ready...");
                        cyclicBarrier.await();
                    } catch (BrokenBarrierException | InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ": go...");
                }, "threadA-" + i).start();
            }
        }
    }

    @SneakyThrows
    @After
    public void after() {
        System.out.println(System.in.read());
    }
}
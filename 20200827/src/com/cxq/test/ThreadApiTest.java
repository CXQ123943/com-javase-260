package com.cxq.test;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author CXQ
 * @version 1.0
 */
public class ThreadApiTest {

    /**
     * 线程状态的API测试
     * */
    @Test
    public void baseApi() {
        Thread thread = new Thread(() -> {
            System.out.println(Thread.currentThread());
        },"threadA");
        thread.setName("threadB");
        System.out.println(thread.getName());
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println(thread.isAlive());
        System.out.println(thread.getPriority());
        thread.start();
        System.out.println(thread.isAlive());
    }

    @Test
    public void sleep() throws InterruptedException {
        System.out.println("thread-main: start...");
        Thread.sleep(2000L);
        System.out.println("thread-main: over...");
        TimeUnit.SECONDS.sleep(1L);
        System.out.println("thread-main: start...");
        TimeUnit.SECONDS.sleep(2L);
        System.out.println("thread-main: over...");
    }

    @Test
    public void join() throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0,j = 5; i < j; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        };

        Thread threadA = new Thread(runnable, "threadA");
        Thread threadB = new Thread(runnable, "threadB");

        threadA.start();

        threadB.start();
        threadA.join();

        for (int i = 0, j = 5; i < j; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }

    @Test
    public void yeild() {

        new Thread(() -> {
            for (int i = 0, j = 5; i < j; i++) {
                Thread.yield();
                System.out.println(Thread.currentThread().getName());
            }
        }, "thread").start();

        for (int i = 0, j = 5; i < j; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

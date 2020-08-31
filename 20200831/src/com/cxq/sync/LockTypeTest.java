package com.cxq.sync;

import lombok.SneakyThrows;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * 测试同步方法的锁的类型，我们让线程A走同步代码块，让线程B走同步方法，如果仍旧发生同步现象，则代表同步方法中的锁和测试中同步代码块中的锁一致。
 *
 * @author CXQ
 * @version 1.0
 */
public class LockTypeTest {

    private static class LockTypeDemoA implements Runnable {

        private int ticketNo;

        @SneakyThrows
        @Override
        public void run() {
            String threadA = "threadA";
            while (true) {
                TimeUnit.MILLISECONDS.sleep(100L);
                if (Thread.currentThread().getName().equals(threadA)) {
                    sellTicket();
                } else {
                    synchronized (this) {
                        int maxNo = 100;
                        if (ticketNo < maxNo) {
                            ticketNo++;
                            String threadName = Thread.currentThread().getName();
                            System.out.println(threadName + "卖票: " + ticketNo);
                        }
                    }
                }
            }
        }

        private synchronized void sellTicket() {
            int maxNo = 100;
            if (ticketNo < maxNo) {
                ticketNo++;
                String threadName = Thread.currentThread().getName();
                System.out.println(threadName + "卖票: " + ticketNo);
            }
        }
    }
/**
 * synchronized修饰静态方法和this锁不是一个类型的,但是对应类锁
 * */
    private static class LockTypeDemoB implements Runnable {

        private static int ticketNo;

        @SneakyThrows
        @Override
        public void run() {
            String threadA = "threadA";
            while (true) {
                TimeUnit.MILLISECONDS.sleep(100L);
                if (Thread.currentThread().getName().equals(threadA)) {
                    sellTicket();
                } else {
                    synchronized (LockTypeDemoB.class) {
                        int maxNo = 100;
                        if (ticketNo < maxNo) {
                            ticketNo++;
                            TimeUnit.MILLISECONDS.sleep(100L);
                            String threadName = Thread.currentThread().getName();
                            System.out.println(threadName + "卖票: " + ticketNo);
                        }
                    }
                }
            }
        }

        private static synchronized void sellTicket() {
            int maxNo = 100;
            if (ticketNo < maxNo) {
                ticketNo++;
                String threadName = Thread.currentThread().getName();
                System.out.println(threadName + "卖票: " + ticketNo);
            }
        }
    }

    @Test
    public void memberMethodLockType() {
        Runnable runnable = new LockTypeDemoA();
        new Thread(runnable, "threadA").start();
        new Thread(runnable, "threadB").start();
    }

    @Test
    public void staticMethodLockType() {
        Runnable runnable = new LockTypeDemoB();
        new Thread(runnable, "threadA").start();
        new Thread(runnable, "threadB").start();
    }

    @SneakyThrows
    @After
    public void after() {
        System.out.println(System.in.read());
    }
}

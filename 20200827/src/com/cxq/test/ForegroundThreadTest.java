package com.cxq.test;

import org.junit.Test;

/**
 * @author CXQ
 * @version 1.0
 */
public class ForegroundThreadTest {

    private static class CustomThread extends Thread {
        @Override
        public void run() {
            for (int i = 0, j = 10; i < j; i++) {
                System.out.print(i);
            }
        }
    }

    @Test
    public void buildByThread() {
        CustomThread customThread = new CustomThread();
        customThread.start();
    }

    @Test
    public void buildByInnerThread() {
        new Thread() {
            @Override
            public void run() {
                for (int i = 0, j = 10; i < j; i++) {
                    System.out.print(i);
                }
            }
        }.start();
    }
}

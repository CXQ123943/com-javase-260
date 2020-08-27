package com.cxq.test;

import org.junit.Test;

/**
 * @author CXQ
 * @version 1.0
 */
public class ForegroundThreadTest {

    private static class SubThread extends Thread {
        @Override
        public void run() {
            for (int i = 0, j = 10; i < j; i++) {
                System.out.print(i);
            }
        }
    }

    @Test
    public void buildByThread() {
        SubThread customThread = new SubThread();
        customThread.start();
    }

    @Test
    public void buildByInnerThread() {
        new Thread() {
            @Override
            public void run() {
                for (int i = 0, j = 10; i < j; i++) {
                    System.out.println(i);
                }
            }
        }.start();
    }

    private static class SubRunnable extends Thread {
        @Override
        public void run() {
            for (int i = 0, j = 10; i < j; i++) {
                System.out.print(i);
            }
        }
    }

    @Test
    public void buildByRunnable() {
        new Thread(new SubRunnable()).start();
    }

    @Test
    public void buildByInnerRunnable() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0, j = 10; i < j; i++) {
                    System.out.print(i);
                }
            }
        }).start();
    }

    @Test
    public void buildByLambda() {
        new Thread(() -> {
            for (int i = 0, j = 10; i < j; i++) {
                System.out.print(i);
            }
        }).start();
    }
}

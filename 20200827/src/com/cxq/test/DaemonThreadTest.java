package com.cxq.test;

/**
 * @author CXQ
 * @version 1.0
 */
public class DaemonThreadTest {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
            int i = 1;
            while (true) {
                System.out.println("DaemonThread... " + i++);
            }
        });

        daemonThread.setDaemon(true);
        daemonThread.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0, j = 30; i < j; i++) {
                    System.out.println(i);
                }
            }
        }).start();
    }
}

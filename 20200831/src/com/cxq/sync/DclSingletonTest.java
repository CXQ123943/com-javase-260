package com.cxq.sync;

import org.junit.Test;

/**
 * @author CXQ
 * @version 1.0
 */
public class DclSingletonTest {

    /**
     * 用了DCL模式还要使用volatile关键字吗？  必须要！！！！
     */
    private static class DclSingleton {
        private volatile static DclSingleton singleton = null;

        private DclSingleton() {
        }

        private static DclSingleton getInstance() {
            if (singleton == null) {
                synchronized (DclSingleton.class) {
                    if (singleton == null) {
                        singleton = new DclSingleton();
                    }
                }
            }
            return singleton;
        }
    }

    @Test
    public void dclSingleton() {
        for (int i = 0, j = 10; i < j; i++) {
            new Thread(() -> {
                System.out.println(DclSingleton.getInstance());
            }).start();
        }
    }
}

package com.cxq.sync;

import org.junit.Test;

/**
 * @author CXQ
 * @version 1.0
 */
public class ReentryTest {

    private synchronized void methodA() {
        System.out.println("methodA()...");
        // 调用methodB时，发现是同一线程，允许重入
        methodB();
    }

    private synchronized void methodB() {
        System.out.println("methodB()...");
    }

    @Test
    public void reentry() {
        // 主线程调用methodA()
        new ReentryTest().methodA();
    }
}
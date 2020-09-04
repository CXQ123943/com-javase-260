package com.cxq.communication;

import lombok.SneakyThrows;
import org.junit.After;
import org.junit.Test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/**
 * @author CXQ
 * @version 1.0
 */
public class LockSupportTest {

    @SneakyThrows
    @Test
    public void lockSupport() {
        Thread thread = new Thread(() -> {
            for (int i = 0, j = 10; i < j; i++) {
                System.out.println(i);
                if (i == 5) {
                    LockSupport.park();
                }
            }
        });
        thread.start();

        TimeUnit.SECONDS.sleep(8L);
        System.out.println("after 8s...");
        LockSupport.unpark(thread);
    }

    @SneakyThrows
    @After
    public void after() {
        System.out.println(System.in.read());
    }
}

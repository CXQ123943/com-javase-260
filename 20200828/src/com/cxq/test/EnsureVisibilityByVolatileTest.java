package com.cxq.test;

import lombok.SneakyThrows;
import org.junit.After;
import org.junit.Test;
import java.util.concurrent.TimeUnit;

public class EnsureVisibilityByVolatileTest {

    private static class VolatileDemo implements Runnable {

        private volatile boolean stop;

        @SneakyThrows
        @Override
        public void run() {

            // must be empty body to block the current thread
            // Always read the flag in L1 cache
            while (!stop) {}
            System.out.println("thread-sub: over");
        }
    }

    @SneakyThrows
    @Test
    public void ensureVisibility() {
        VolatileDemo volatileDemo = new VolatileDemo();
        new Thread(volatileDemo).start();
        TimeUnit.SECONDS.sleep(2L);
        volatileDemo.stop = true;
        System.out.println("thread-main: over");
    }

    @SneakyThrows
    @After
    public void after() {
        System.out.println(System.in.read());
    }

}
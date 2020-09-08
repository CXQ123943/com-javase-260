package com.cxq.pool;

import lombok.SneakyThrows;
import org.junit.After;
import org.junit.Test;

import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * @author CXQ
 * @version 1.0
 */
public class FutureTaskTest {

    @SneakyThrows
    @Test
    public void futureTask() {
        FutureTask<Integer> futureTask = new FutureTask<>(() -> {
            TimeUnit.SECONDS.sleep(2L);
            return 100;
        });

        new Thread(futureTask).start();
        System.out.println("thread-main...");
        System.out.println("thread-main...");

       System.out.println(futureTask.get());
        System.out.println("thread-main...");
        System.out.println("thread-main...");
    }

    @SneakyThrows
    @After
    public void after() {
        System.out.println(System.in.read());
    }
}

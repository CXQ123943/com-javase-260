package com.cxq.pool;

import lombok.SneakyThrows;
import org.junit.After;
import org.junit.Test;

import java.util.concurrent.*;

/**
 * @author CXQ
 * @version 1.0
 */
public class CallableTest {

    @SneakyThrows
    @Test
    public void callable() {
        Callable<Integer> callable = () -> {
            TimeUnit.SECONDS.sleep(2L);
            return 100;
        };

        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Integer> future = executorService.submit(callable);

        System.out.println("thread-main...");
        System.out.println("thread-main...");

        System.out.println(future.get());
        System.out.println("thread-main...");
        System.out.println("thread-main...");

        executorService.shutdown();
    }

    @SneakyThrows
    @After
    public void after() {
        System.out.println(System.in.read());
    }
}

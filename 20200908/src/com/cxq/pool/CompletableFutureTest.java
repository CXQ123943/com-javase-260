package com.cxq.pool;

import lombok.SneakyThrows;
import org.junit.After;
import org.junit.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author CXQ
 * @version 1.0
 */
public class CompletableFutureTest {

    @SneakyThrows
    String taskA() {
        TimeUnit.SECONDS.sleep(1L);
        System.out.println("taskA over...");
        return "tsakA-over";
    }

    @SneakyThrows
    String taskB() {
        TimeUnit.SECONDS.sleep(2L);
        System.out.println("taskB over...");
        return "taskB-over";
    }

    @SneakyThrows
    String taskC() {
        TimeUnit.SECONDS.sleep(3L);
        System.out.println("taskC over...");
        return "taskC-over";
    }

    @SneakyThrows
    @Test
    public void performTask() {
        long start = System.currentTimeMillis();
        taskA();
        taskB();
        taskC();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    @SneakyThrows
    @Test
    public void performTaskByCompletableFuture() {
        long start = System.currentTimeMillis();
        CompletableFuture<String> futureA = CompletableFuture.supplyAsync(this::taskA);
        CompletableFuture<String> futureB = CompletableFuture.supplyAsync(this::taskB);
        CompletableFuture<String> futureC = CompletableFuture.supplyAsync(this::taskC);
        CompletableFuture.anyOf(futureA, futureB, futureC).join();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    @SneakyThrows
    @After
    public void after() {
        System.out.println(System.in.read());
    }
}
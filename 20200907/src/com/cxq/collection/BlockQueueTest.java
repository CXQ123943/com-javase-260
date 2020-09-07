package com.cxq.collection;

import lombok.SneakyThrows;
import org.junit.After;
import org.junit.Test;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * @author CXQ
 * @version 1.0
 */
public class BlockQueueTest {

    @Test
    public void concurrentLinkedQueue() {
        Queue<String> queue = new ConcurrentLinkedQueue<>();
        queue.add("zhao-si");
        System.out.println(queue.poll());
    }

    @Test
    public void linkedBlockingDeque() {

        BlockingQueue<Integer> list = new LinkedBlockingDeque<>();
        new Thread(() -> {
            try {
                while (true) {
                    TimeUnit.SECONDS.sleep(2L);
                    int data = new Random().nextInt(100);
                    list.put(data);
                    System.out.println("produce: " + data);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        for (int i = 0, j = 5; i < j; i++) {
            new Thread(() -> {
                while (true) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " : " + list.take());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }

    @SneakyThrows
    @After
    public void after() {
        System.out.println(System.in.read());
    }
}

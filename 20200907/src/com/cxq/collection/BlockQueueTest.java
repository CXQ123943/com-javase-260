package com.cxq.collection;

import lombok.SneakyThrows;
import org.junit.After;
import org.junit.Test;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.*;

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
    public void linkedBlockingQueue() {
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

    @Test
    public void linkedBlockingDeque() {
        LinkedBlockingDeque<String> list = new LinkedBlockingDeque<>();
        list.addFirst("zhao-si");
        list.addLast("liu-neng");
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        System.out.println(list);
    }

    @SneakyThrows
    @Test
    public void arrayBlockingQueue() {
        BlockingQueue<Integer> list = new ArrayBlockingQueue<>(10);
        for (int i = 0, j = 10; i < j; i++) {
            list.put(i);
        }
        System.out.println(list.size());
        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(2L);
                System.out.println(list.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "YYY").start();

        // blocking and wait for consumer
        list.put(250);
        System.out.println("over...");
    }

    private class MyTask implements Delayed {

        private String taskName;
        private Long timestamp;

        MyTask(String taskName, Long timestamp) {
            this.taskName = taskName;
            this.timestamp = timestamp;
        }

        /**
         * 计算延迟
         */
        @Override
        public long getDelay(TimeUnit unit) {
            return unit.convert(timestamp - System.currentTimeMillis(), TimeUnit.SECONDS);
        }

        @Override
        public int compareTo(Delayed o) {
            return (int) (getDelay(TimeUnit.MILLISECONDS) - o.getDelay(TimeUnit.MILLISECONDS));
        }

        @Override
        public String toString() {
            return taskName + ": " + timestamp;
        }
    }

    @SneakyThrows
    @Test
    public void delayQueue() {
        DelayQueue<MyTask> list = new DelayQueue<>();
        long currentTime = System.currentTimeMillis();
        list.put(new MyTask("task01", currentTime + 3));
        list.put(new MyTask("task02", currentTime + 1));
        list.put(new MyTask("task03", currentTime + 2));
        for (int i = 0, j = list.size(); i < j; i++) {
            System.out.println(list.take());
        }
    }

    @SneakyThrows
    @After
    public void after() {
        System.out.println(System.in.read());
    }
}

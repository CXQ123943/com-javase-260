package com.cxq.communication;

import lombok.Data;
import lombok.SneakyThrows;
import org.junit.After;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author CXQ
 * @version 1.0
 */
public class WaitNotifyTest {

    private Food food = new Food();

    @Data
    private static class Food {
        private String name;
        private String type;
        //存在状态标志
        private boolean exist;
    }

    /**
     * 生产者消费者模型，没有锁，也没有等待唤醒 - 生产者
     * 这种情况会出现串行现象 例如；cake: mi-qi
     */
    private static class AsyncProducer implements Runnable {

        private final Food food;
        private boolean isEnglish;

        AsyncProducer(Food food) {
            this.food = food;
        }

        @Override
        public void run() {
            while (true) {
                if (isEnglish) {
                    food.setName("cake");
                    food.setType("mickey");
                } else {
                    food.setName("dan-gao");
                    food.setType("mi-qi");
                }
                isEnglish = !isEnglish;
            }
        }
    }

    /**
     * 生产者消费者模型，没有锁，也没有等待唤醒 - 消费者
     */
    private static class AsyncConsumer implements Runnable {

        private final Food food;

        AsyncConsumer(Food food) {
            this.food = food;
        }

        @SneakyThrows
        @Override
        public void run() {
            while (true) {
                TimeUnit.SECONDS.sleep(1L);
                System.out.println(food.getName() + ": " + food.getType());
            }
        }
    }

    @SneakyThrows
    @Test
    public void asynchronousVersion() {
        new Thread(new AsyncProducer(food)).start();
        new Thread(new AsyncConsumer(food)).start();
    }

    /**
     * 生产者消费者模型，有锁，但是没有等待唤醒 - 生产者
     * 这种直接加锁会出现消费者进程进不去，一直在生产
     */
    private static class SyncProducer implements Runnable {

        private final Food food;
        private boolean isEnglish;

        SyncProducer(Food food) {
            this.food = food;
        }

        @Override
        public void run() {
            while (true) {
                // Don't use "synchronized (this)"
                synchronized (food) {
                    if (isEnglish) {
                        food.setName("cake");
                        food.setType("mickey");
                    } else {
                        food.setName("dan-gao");
                        food.setType("mi-qi");
                    }
                    isEnglish = !isEnglish;
                }
            }
        }
    }

    /**
     * 生产者消费者模型，有锁锁，但是没有等待唤醒 - 消费者
     */
    private static class SyncConsumer implements Runnable {

        private final Food food;

        SyncConsumer(Food food) {
            this.food = food;
        }

        @SneakyThrows
        @Override
        public void run() {
            while (true) {
                synchronized (food) {
                    TimeUnit.MILLISECONDS.sleep(300L);
                    System.out.println(food.getName() + ": " + food.getType());
                }
            }
        }
    }

    @Test
    public void synchronizedVersion() {
        new Thread(new SyncProducer(food)).start();
        new Thread(new SyncConsumer(food)).start();
    }

    /**
     * 生产者消费者模型，有锁锁且有等待唤醒 - 生产者
     * 如果有值，生产者wait
     * 如果没值，生产，exist设置为true，叫醒消费者
     */
    private static class OneByOneProducer implements Runnable {

        private final Food food;
        private boolean isEnglish;

        OneByOneProducer(Food food) {
            this.food = food;
        }

        @SneakyThrows
        @Override
        public void run() {
            while (true) {
                synchronized (food) {
                    if (food.isExist()) {
                        food.wait();
                    } else {
                        if (isEnglish) {
                            food.setName("cake");
                            food.setType("mickey");
                        } else {
                            food.setName("dan-gao");
                            food.setType("mi-qi");
                        }
                        isEnglish = !isEnglish;
                        food.setExist(true);
                        food.notify();
                    }
                }
            }
        }
    }

    /**
     * 生产者消费者模型，有锁锁且有等待唤醒 - 消费者
     * 如果有值，消费，exist设置为false，叫醒生产者
     * 如果没值，消费者wait
     */
    private static class OneByOneConsumer implements Runnable {

        private final Food food;

        OneByOneConsumer(Food food) {
            this.food = food;
        }

        @SneakyThrows
        @Override
        public void run() {
            while (true) {
                synchronized (food) {
                    if (food.isExist()) {
                        TimeUnit.SECONDS.sleep(1L);
                        System.out.print(food.getName() + ": " + food.getType() + "\n");
                        food.setExist(false);
                        food.notify();
                    } else {
                        food.wait();
                    }
                }

            }
        }
    }

    @Test
    public void oneByOneVersion() {
        new Thread(new OneByOneProducer(food)).start();
        new Thread(new OneByOneConsumer(food)).start();
    }

    @SneakyThrows
    @After
    public void after() {
        System.out.println(System.in.read());
    }
}

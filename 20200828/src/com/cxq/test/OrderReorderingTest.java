package com.cxq.test;

import lombok.SneakyThrows;
import org.junit.Test;

/**
 * @author CXQ
 * @version 1.0
 */
public class OrderReorderingTest {
    private /*volatile*/ int x = 0, y = 0, a = 0, b = 0;

    @SneakyThrows
    @Test
    public void orderReorder() {
        int count = 0;
        while (true) {
            count++;

            Thread threadA = new Thread(() -> {
                a = 1;
                x = b;
            });
            Thread threadB = new Thread(() -> {
                b = 1;
                y = a;
            });

            threadA.start();
            threadB.start();
            threadA.join();
            threadB.join();

            System.out.printf("第%d次：x=%d，y=%d\n", count, x, y);

            if (x == 0 && y == 0) {
                System.out.println("发生了指令重排，跳出循环");
                break;
            } else {
                x = 0;
                y = 0;
                a = 0;
                b = 0;
            }
        }
    }
}

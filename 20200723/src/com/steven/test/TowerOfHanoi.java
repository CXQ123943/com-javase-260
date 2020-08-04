package com.steven.test;

import org.junit.Test;

/**
 * @author StevenChen
 * @version 1.0
 */
public class TowerOfHanoi {
    @Test
    public void testHanoi() {
        hanoi(10, 'A', 'B', 'C');
    }

    // num 是一共有多少个盘子、a b c是三根柱子
    private void hanoi(int num, char a, char b, char c) {
        if (num == 1) {
            System.out.printf("1号：%s >> %s\n", a, c);
        } else {
            // 无论多少盘子都分成两部分，num-1的上面的部分（看成一个盘子）和 最后一个盘子
            // 上面的盘子
            int hanoiTopPart = num - 1;
            // 将上面的盘子，从a途经c移到b
            hanoi(hanoiTopPart, a, c, b);
            System.out.printf("%s号：%s >> %s\n", num, a, c);
            // 将上面的盘子，再从b途经a移到c
            hanoi(hanoiTopPart, b, a, c);
        }
    }
}

package com.cxq.test;

import org.junit.Test;

import java.util.BitSet;
import java.util.Scanner;

/**
 * @author CXQ
 * @version 1.0
 */
public class BitSetTest {

    @Test
    public void bitSet() {
        int day = 15;
        BitSet bitSet = new BitSet(365);
        int[] holidays = {1, 15, 50, 148, 185, 246, 281, 316, 326, 359};
        for (int i = 0, j = holidays.length; i < j; i++) {
            bitSet.set(holidays[i]);
        }
        boolean result = bitSet.get(day);
        System.out.println(result ? "第" + day + "天是假期..." : "第" + day + "天不是假期...");
    }
}

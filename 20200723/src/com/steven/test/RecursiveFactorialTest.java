package com.steven.test;

import org.junit.Test;

/**
 * @author StevenChen
 * @version 1.0
 */
public class RecursiveFactorialTest {
    @Test
    public void testJC() {
        int result = getJieCheng(5);
        System.out.println(result);
    }
    private int getJieCheng(int num) {
        // 第1次 num=5 return 5*getJieCheng(4) 待命
        // 第2次 num=4 return 4*getJieCheng(3) 待命
        // 第3次 num=3 return 3*getJieCheng(2) 待命
        // 第4次 num=2 return 2*getJieCheng(1) 待命
        // 第5次 num=1 return 1

        if (num == 1) {
            return 1;
        }// 出口
        else{return num * getJieCheng(num - 1);
        }
    }
}

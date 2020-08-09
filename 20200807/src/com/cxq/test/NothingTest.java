package com.cxq.test;

import org.junit.Test;

/**
 * @author CXQ
 * @version 1.0
 */
public class NothingTest {
    private int returnInTryOrCatchWithBase(int num) {
        try {
            System.out.println(100 / num);
            return 100;
        } catch (Exception e) {
            System.out.println("catch执行...");
            return 200;
        } finally {
            System.out.println("finally执行...");
            num = 300;
        }
    }

    private int[] returnInTryOrCatchWithReference(int num) {
        int[] arr = {0, 1};
        try {
            System.out.println(100 / num);
            arr[0] = 100;
            return arr;
        } catch (Exception e) {
            System.out.println("catch执行...");
            arr[0] = 200;
            return arr;
        } finally {
            System.out.println("finally执行...");
            arr[0] = 300;
        }
    }

    private int returnInTryOrCatchAndFinally(int num) {
        try {
            System.out.println(100 / num);
            return 100;
        } catch (Exception e) {
            System.out.println("catch执行...");
            return 200;
        } finally {
            System.out.println("finally执行...");
            return 300;
        }
    }

    @Test
    public void returnTest() {
        System.out.println(returnInTryOrCatchWithBase(100));
        System.out.println(returnInTryOrCatchWithBase(0));
        System.out.println(returnInTryOrCatchWithReference(100)[0]);
        System.out.println(returnInTryOrCatchWithReference(0)[0]);
        System.out.println(returnInTryOrCatchAndFinally(100));
        System.out.println(returnInTryOrCatchAndFinally(0));
    }

    @Test
    public void multipleCatchTest() {
        int[] arr = {1, 2};
        int num = 0;
        try {
            arr[0] = 1 / num;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}






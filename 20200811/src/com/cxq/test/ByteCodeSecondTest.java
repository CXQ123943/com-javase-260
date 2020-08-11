package com.cxq.test;

/**
 * @author CXQ
 * @version 1.0
 */
public class ByteCodeSecondTest {
    public static void main(String[] args) {
        String unit = new String("元");
        int money = getMoney();
        add(money, unit);
    }
    private static int getMoney() {
        return 10;
    }
    private static void add(int money, String unit) {
        System.out.println(money + unit);
    }
}

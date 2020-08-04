package com.steven.test;

import java.util.Scanner;

/**
 * @author StevenChen
 * @version 1.0
 */
public class ScannerTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println(next);
        scanner.close();
    }

//    @Test
//    public void build(){
//        Scanner scanner = new Scanner(System.in);
//        String next = scanner.next();
//        System.out.println(next);
//        scanner.close();
//    }


}

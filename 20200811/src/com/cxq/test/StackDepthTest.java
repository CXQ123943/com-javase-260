package com.cxq.test;

/**
 * @author CXQ
 * @version 1.0
 */
public class StackDepthTest {
   private static int num;
   public static void main(String[] args){
       try {
           fn();
       } catch (Throwable e) {
           System.out.println("栈深为：" + num);
           e.printStackTrace();
       }
   }

   private static void fn(){
       num++;
       fn();
   }
}

package com.joe.text;

import org.junit.Test;

/**
 * @author StevenChen
 * @version 1.0
 */
public class StringExpandTest {

    @Test
    public void Stitching(){
        StringBuilder stringBuilder = new StringBuilder("a");
        stringBuilder.append("b");
        System.out.println(stringBuilder.toString());
    }

    @Test
    public void StitchingBuilder(){
        StringBuilder stringBuilder = new StringBuilder("cndsj");
        System.out.println(stringBuilder.toString());
        System.out.println("替换2-3之间的字符（包括2，不包括3）："+new StringBuilder("love").replace(2, 3, "n").toString());
        System.out.println("像2后写入一串字符（不包括2："+new StringBuilder("how are you?").insert(4, "old ").toString());
        System.out.println("删除2-6之间的字符（包括2不包括6）："+new StringBuilder("I not am ok!").delete(2, 6).toString());
        System.out.println("删除第0位置上的数："+new StringBuilder("never").deleteCharAt(0).toString());
        System.out.println("截取出n1到n2之间的所有元素并返回:"+new StringBuilder("female").substring(2, 6));
        System.out.println("水平翻转字符串:"+new StringBuilder("evil").reverse().toString());
    }

    @Test
    public void stringBuilderStitchingTimeConsuming(){
        // 获取时间戳：距离1970年1月1日 0点0时0分 一个毫秒数。
        long startTime = System.currentTimeMillis();

        StringBuilder stringBuilder = new StringBuilder("");

        for (int i = 0; i < 100000; i++) {
            stringBuilder.append(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("总耗时：" + (endTime - startTime) + "毫秒");
    }

    @Test
    public void plusSignStitchingTimeConsuming(){
        // 获取时间戳：距离1970年1月1日 0点0时0分 一个毫秒数。
        long startTime = System.currentTimeMillis();

        String str = "";
        for (int i = 0; i < 10000; i++) {
            str = str + i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("总耗时：" + (endTime - startTime) + "毫秒");
    }


}

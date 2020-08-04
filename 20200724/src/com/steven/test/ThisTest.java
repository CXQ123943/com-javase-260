package com.steven.test;

import com.steven.demo.ThisDemo;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author StevenChen
 * @version 1.0
 */
public class ThisTest {

    @Test
    public void thisConstructor(){
        ThisDemo cxq = new ThisDemo("cxq", 3, new double[]{4, 5, 3});
        System.out.println(cxq);
        System.out.println("=========================================");

        cxq.setName("zds");
        cxq.setAge(34);
        cxq.setScore(new double[]{5432,543,6});
        System.out.println(cxq.getName());
        System.out.println(cxq.getAge());
        System.out.println(Arrays.toString(cxq.getScore()));
    }
}

package com.steven.test;

import com.steven.demo.AddNum;
import org.junit.Test;

/**
 * @author StevenChen
 * @version 1.0
 */
public class AddNumTest {
    @Test
    public void addNumTest01(){
        int result = adddNum(2,5);
        System.out.println(result);
    }

    @Test
    //这里是调用了了一个静态的AddNum类。
    public void addNumTest02(){
        int result01 = AddNum.addNum(4,6);
        System.out.println(result01);
        System.out.println("==========================");

        AddNum addNum = new AddNum();
//        int result02 = addNum.addNum(3,4);
        int result02 = AddNum.addNum(6,4);
    }


    public int adddNum(int a,int b){
        return a + b;
    }
}

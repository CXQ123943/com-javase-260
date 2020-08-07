package com.cxq.test;

import com.cxq.prototype.Sheep;
import org.junit.Test;

import java.util.Date;

/**
 * @author CXQ
 * @version 1.0
 */
public class multipleShallowCloneTest {

    @Test
    public void multipleShallowClone(){
        Date birth = new Date();
        Sheep sheepA = new Sheep();
        sheepA.setName("dorset");
        sheepA.setBirth(birth);
        System.out.println("sheepA's name is " + sheepA.getName());
        System.out.println("sheepA's birth is " + sheepA.getBirth());

        //克隆出一个实例
        Sheep sheepB = sheepA.multipleShallowClone(sheepA);

        System.out.println(sheepA == sheepB ? "sheepA and sheepB is a sheep" : "sheepA and sheepB is different sheep");

        sheepB.setName("dolly");
        System.out.println("sheepB's name is " + sheepB.getName());
        System.out.println("sheepB's birth is " + sheepB.getBirth());

        birth.setTime(55555L);

        System.out.println("Test whether the birthdays of the two sheep are the same：");
        System.out.println("sheepA's birth is " + sheepA.getBirth());
        System.out.println("sheepB's birth is " + sheepB.getBirth());
    }
}

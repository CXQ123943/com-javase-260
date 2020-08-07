package com.cxq.test;

import com.cxq.prototype.Sheep;
import org.junit.Test;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * @author CXQ
 * @version 1.0
 */
public class ShallowCloneTest {

    @Test
    public void shallowclone(){
        Date birth = new Date();
        Sheep sheepA = new Sheep();
        sheepA.setName("goatKing");
        sheepA.setBirth(birth);
        System.out.println("sheepA's name is " + sheepA.getName());
        System.out.println("sheepA's birth is " + sheepA.getBirth());

        //克隆出一个实例
        Sheep sheepB = sheepA.shallowClone(sheepA);

        //判断两个实例是否为同一个实例对象
        System.out.println(sheepA == sheepB ? "sheepA与sheepB是同一只羊" : "sheepA与sheepB不是同一只羊");
        sheepB.setName("dolly");
        System.out.println("sheepB's name is " + sheepB.getName());
        System.out.println("sheepB's birth is " + sheepB.getBirth());
        birth.setTime(555555L);
        sheepB.setBirth(birth);
        System.out.println("sheepA's birth is " + sheepA.getBirth());
        System.out.println("sheepB's birth is " + sheepB.getBirth());
    }
}

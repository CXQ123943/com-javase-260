package com.cxq.test;

import com.cxq.prototype.Sheep;
import org.junit.Test;

import java.util.Date;

/**
 * @author CXQ
 * @version 1.0
 */
public class DeepCloneTest {

    @Test
    public void deepClone(){
        Date birth = new Date();
        Sheep sheepA = new Sheep();
        sheepA.setName("dorset");
        sheepA.setBirth(birth);
        //克隆出一个实例
        Sheep sheepB = sheepA.deepClone(sheepA);
        sheepB.setName("dolly");
        birth.setTime(555555L);

    }

}

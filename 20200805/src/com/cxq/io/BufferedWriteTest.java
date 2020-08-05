package com.cxq.io;

import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * @author CXQ
 * @version 1.0
 */
public class BufferedWriteTest {

    @Test
    public void bufferedWrite(){
        String filePath = "D:" + File.separator + "idea2018" + File.separator + "idea"+ File.separator + "random.txt";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))){
            Random random = new Random();
            for (int i = 0; i < 100; i++) {
                bufferedWriter.write("随机数：" + (random.nextInt(100)));
                bufferedWriter.newLine();
            }
            System.out.println("输入完成！");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

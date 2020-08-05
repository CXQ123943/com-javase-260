package com.cxq.io;

import org.junit.Test;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author CXQ
 * @version 1.0
 */
public class BufferedOutputTest {

    @Test
    public void bufferOutputSteam(){
        String filePath = "D:" + File.separator + "idea2018" + File.separator + "idea"+ File.separator + "io.txt";
        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(filePath))){

            int times = 10;
            for (int i = 0; i < times; i++) {
                bufferedOutputStream.write('A');
            }
            System.out.println("写入完成！");
            bufferedOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.cxq.io;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author CXQ
 * @version 1.0
 */
public class BufferedIntputTest {

    @Test
    public void bufferIntputSteam(){
        String filePath = "D:" + File.separator + "idea2018" + File.separator + "idea"+ File.separator + "HelloWorld.txt";
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 8192)){
            System.out.println("pos-01：" + (char) bufferedInputStream.read());
            System.out.println("pos-02：" + (char) bufferedInputStream.read());

            bufferedInputStream.mark(4);

            System.out.println("pos-03：" + (char) bufferedInputStream.read());
            System.out.println("pos-04：" + (char) bufferedInputStream.read());
            System.out.println("pos-05：" + (char) bufferedInputStream.read());
            System.out.println("pos-06：" + (char) bufferedInputStream.read());

            bufferedInputStream.reset();

            System.out.println("pos-03：" + (char) bufferedInputStream.read());
            System.out.println("pos-04：" + (char) bufferedInputStream.read());
            System.out.println("pos-05：" + (char) bufferedInputStream.read());
            System.out.println("pos-06：" + (char) bufferedInputStream.read());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

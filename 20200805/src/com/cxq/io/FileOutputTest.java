package com.cxq.io;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author CXQ
 * @version 1.0
 */
public class FileOutputTest {

    @Test
    public void fileOutputSteamTest(){
        String filePath = "D:" + File.separator + "idea2018" + File.separator + "idea"+ File.separator + "HelloWorld.java";
        String targetPath = "D:" + File.separator + "idea2018" + File.separator + "idea"+ File.separator + "HelloWorld.txt";
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             FileOutputStream fileOutputStream = new FileOutputStream(targetPath,true)){

            int b;
            while ((b = fileInputStream.read()) != -1){
                fileOutputStream.write(b);
            }

            fileOutputStream.flush();
            System.out.println("copy over!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.cxq.io;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author CXQ
 * @version 1.0
 */
public class BufferedReaderTest {

    @Test
    public void bufferedReader(){
        String filePath = "D:" + File.separator + "idea2018" + File.separator + "idea"+ File.separator + "HelloWorld.java";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
            String str = "";
            while ((str = bufferedReader.readLine()) != null){
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
package com.cxq.io;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author CXQ
 * @version 1.0
 */
public class FileReaderTest {

    @Test
    public void fileReader() {
        String filePath = "D:" + File.separator + "idea2018" + File.separator + "idea"+ File.separator + "HelloWorld.java";
        try (FileReader fileReader = new FileReader(filePath)){
            System.out.println("输入流编码为：" + fileReader.getEncoding());
            int b;
            while ((b = fileReader.read()) != -1){
                System.out.print((char)b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.cxq.io;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author CXQ
 * @version 1.0
 */
public class FileInputTest {

    @Test
    public void fileInputsteamTest(){
        String filePath = "D:\\idea2018\\idea\\HelloWorld.java";
        // 将FileInputStream管插在你要操作的文件上
        try(FileInputStream fileInputStream = new FileInputStream(filePath)) {
            // 查看可见（还剩下的）总字节数
            System.out.println("总结字节数为" + fileInputStream.available());

            // 定义一个中间变量，负责接收每次循环出来的字节
            int b;
            while ((b = fileInputStream.read()) != -1){
                System.out.print((char) b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

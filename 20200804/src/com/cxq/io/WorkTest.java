package com.cxq.io;

/**
 * @author CXQ
 * @version 1.0
 */
import java.io.*;
public class WorkTest {
    public static void main(String[] args) {
        File dir = new File("D:\\dir");
        dir.mkdir();
        File f1 = new File(dir, "f1.txt");
        try {
            f1.createNewFile();
        } catch (IOException e) { ; }
        File newDir = new File("D:\\ewDir");
        System.out.println(dir.renameTo(newDir) ? "目录改名成功" : "目录改名失败");
    }
}
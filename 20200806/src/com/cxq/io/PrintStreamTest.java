package com.cxq.io;

import org.junit.Test;

import java.io.*;

/**
 * @author CXQ
 * @version 1.0
 */
public class PrintStreamTest {

    @Test
    public void printStream(){
        String filePath = "D:" + File.separator + "idea2018" + File.separator + "idea"+ File.separator + "emp.dat";
        try (PrintStream printStream = new PrintStream(new FileOutputStream(filePath))){
            PrintStream out = System.out;
            System.setOut(printStream);
            int max = 128;
            for (int i = 0; i < max; i++) {
                System.out.print((char) i + " ");
            }
            System.setOut(out);
            System.out.println("print over...");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

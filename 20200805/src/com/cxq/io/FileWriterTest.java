package com.cxq.io;

import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author CXQ
 * @version 1.0
 */
public class FileWriterTest {

    @Test
    public void fileWriter(){
        String filePath = "D:" + File.separator + "idea2018" + File.separator + "idea"+ File.separator + "Unicode.dat";
        try (FileWriter fileWriter = new FileWriter(filePath)){
            int maximumLength = 65535;
            for (int i = 0; i < maximumLength; i++) {
                fileWriter.write(i);
            }
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

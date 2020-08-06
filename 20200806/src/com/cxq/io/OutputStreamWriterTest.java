package com.cxq.io;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author CXQ
 * @version 1.0
 */
public class OutputStreamWriterTest {

    @Test
    public void outputSteamWriter() throws IOException {
        String filePath = "D:" + File.separator + "idea2018" + File.separator + "idea"+ File.separator + "HelloWorld.txt";
        OutputStreamWriter outputStreamWriter = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            outputStreamWriter.write("你好");
            System.out.println(outputStreamWriter.getEncoding());
            outputStreamWriter.flush();
            outputStreamWriter = new OutputStreamWriter(fileOutputStream,"GBK");
            outputStreamWriter.write("世界");
            System.out.println(outputStreamWriter.getEncoding());
            outputStreamWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStreamWriter != null){
                outputStreamWriter.close();
            }
        }
    }
}

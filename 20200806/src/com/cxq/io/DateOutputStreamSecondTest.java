package com.cxq.io;

import org.junit.Test;

import java.io.*;

/**
 * @author CXQ
 * @version 1.0
 */
public class DateOutputStreamSecondTest {

    @Test
    public void dateOutputStream(){
        String filePath = "D:" + File.separator + "idea2018" + File.separator + "idea"+ File.separator + "secondtest.txt";
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(filePath));
             DataInputStream dataInputStream = new DataInputStream(new FileInputStream(filePath))){

            dataOutputStream.writeInt(250);
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeDouble(3.14);
            dataOutputStream.writeUTF("你好");
            dataOutputStream.flush();

            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readDouble());
//            System.out.println(dataInputStream.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

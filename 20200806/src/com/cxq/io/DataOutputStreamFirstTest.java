package com.cxq.io;

import org.junit.Test;

import java.io.*;

/**
 * @author CXQ
 * @version 1.0
 */
public class DataOutputStreamFirstTest {

    @Test
    public void dataOutputStream() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        DataOutputStream dataOutputStream = null;
        ByteArrayInputStream byteArrayInputStream;
        DataInputStream dataInputStream = null;

        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeInt(250);
            dataOutputStream.writeDouble(3.14);
            dataOutputStream.flush();

            byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            dataInputStream = new DataInputStream(byteArrayInputStream);
            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readDouble());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dataOutputStream != null){
                dataOutputStream.close();
            }
            if (dataInputStream != null){
                dataInputStream.close();
            }
        }
    }
}

package com.cxq.nio;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author CXQ
 * @version 1.0
 */
public class FileChannelTest {

    @Test
    public void fileChannel() throws Exception {
        String srcPath = "D:" + File.separator + "idea2018" + File.separator + "idea" + File.separator + "nio-src.txt";
        String destPath = "D:" + File.separator + "idea2018" + File.separator + "idea" + File.separator + "nio-dest.txt";
        FileInputStream fileInputStream = new FileInputStream(srcPath);
        FileOutputStream fileOutputStream = new FileOutputStream(destPath);
        FileChannel fileInputStreamChannel = fileInputStream.getChannel();
        FileChannel fileOutputStreamChannel = fileOutputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        while (true) {
//            byteBuffer.clear();
            int read = fileInputStreamChannel.read(byteBuffer);
            if (read == -1) {
                break;
            }
        }
        byteBuffer.flip();
        fileOutputStreamChannel.write(byteBuffer);

        fileInputStreamChannel.close();
        fileOutputStreamChannel.close();
        fileInputStream.close();
        fileOutputStream.close();
        System.out.println("over...");
    }
}

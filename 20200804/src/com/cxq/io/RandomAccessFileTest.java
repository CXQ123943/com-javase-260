package com.cxq.io;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author CXQ
 * @version 1.0
 */
public class RandomAccessFileTest {

    @Test
    public void wrideAndRead() throws IOException {
        String name = "D:\\idea2018\\idea\\ideacode\\io\\emp.txt";
        RandomAccessFile randomAccessFile = new RandomAccessFile(name,"rw");

        // 写
        randomAccessFile.writeUTF("赵四");
        randomAccessFile.writeInt(18);
        randomAccessFile.writeUTF("刘能");
        randomAccessFile.writeInt(38);
        randomAccessFile.writeUTF("广坤");
        randomAccessFile.writeInt(58);

        // 移动指针位置为0
        randomAccessFile.seek(24);

        // 读
        System.out.println(randomAccessFile.readUTF());
        System.out.println(randomAccessFile.readInt());

        randomAccessFile.seek(12);
        System.out.println(randomAccessFile.readUTF());
        System.out.println(randomAccessFile.readInt());

        randomAccessFile.seek(0);
        System.out.println(randomAccessFile.readUTF());
        System.out.println(randomAccessFile.readInt());
        randomAccessFile.close();
    }
}

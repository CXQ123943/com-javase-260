package com.cxq.io;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @author CXQ
 * @version 1.0
 */
public class FileTest {

    private File file;

    @Before
    public void before() throws IOException {
        String pathDirs = "D:\\idea2018\\idea\\ideacode\\io";
        File dirs = new File(pathDirs);
        if (!dirs.exists()){
            System.out.println(dirs.mkdirs() ? "创建成功" : "创建失败");
        }
        String pathname = pathDirs + "\\build.txt";
        file = new File(pathname);
        if (file.exists()){
            System.out.println(file.delete() ? "删除成功" : "删除失败");
        }
        System.out.println(file.createNewFile() ? "文件创建成功" : "文件创建失败");
    }

    @Test
    public void fileApi() {
        System.out.println("文件名：" + file.getName());
        System.out.println("文件路径：" + file.getPath());
        System.out.println("文件大小：" + file.length());
        System.out.println(file.canRead() ? "可读" : "不可读");
        System.out.println(file.canWrite() ? "可写" : "不可写");
        System.out.println(file.isFile() ? "是文件" : "不是文件");
        System.out.println(file.isDirectory() ? "是目录" : "不是目录");
        File newFile = new File("D:\\idea2018\\idea\\ideacode\\io\\build-1.txt");
        System.out.println(file.renameTo(newFile) ? "修改成功" : "修改失败");
        System.out.println(file.equals(newFile) ? "是同一个" : "非同一个");
        System.out.println("父目录：" + file.getParent());
        System.out.println(file.isHidden() ? "隐藏文件" : "非隐藏文件");
        System.out.println("最后修改日期：" + new Date(file.lastModified()));
        System.out.println(file.isAbsolute() ? "是绝对路径" : "不是绝对路径");
        System.out.println("文件绝对路径：" + file.getAbsolutePath());
    }
}

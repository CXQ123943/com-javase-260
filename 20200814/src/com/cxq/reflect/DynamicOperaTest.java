package com.cxq.reflect;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.*;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @author CXQ
 * @version 1.0
 */
public class DynamicOperaTest {
    public static void main(String[] args) throws Exception {
        outputStreamReader();
        String outPath = "D:" + File.separator + "HelloWorld.java";
        JavaCompiler javac = ToolProvider.getSystemJavaCompiler();
        int run = javac.run(null, null, null, outPath);
        System.out.println(run == 0 ? "javac success" : "javac unsuccess");
        if (run == 0){
            dynamicRun();
        }
    }

    private static void outputStreamReader() throws Exception{
        String outPath = "D:" + File.separator + "HelloWorld.java";
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outPath));
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            if ("".equalsIgnoreCase(str)){
                break;
            }
            bufferedWriter.write(str);
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    private static void dynamicRun() throws Exception {
        URL url = new URL("file:" + File.separator + "D:" + File.separator);
        URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{url});
        Class<?> klass = urlClassLoader.loadClass("HelloWorld");
        Method method = klass.getMethod("main", String[].class);
        // main() is static, so p1 of invoke() must be null
        // 这里必须强转成Object类型，否则String[]数组参数会被拆成"a"和"b",与main方法的参数个数不符合
        method.invoke(null, (Object) new String[]{"a", "b"});
        urlClassLoader.close();
        File file01 = new File("D:" + File.separator + "HelloWorld.java");
        file01.delete();
        System.out.println("java文件删除成功");
        File file02 = new File("D:" + File.separator + "HelloWorld.class");
        file02.delete();
        System.out.println("class文件删除成功");
    }
}
package com.cxq.test;

import org.junit.Test;

import java.io.FileReader;
import java.util.Properties;

/**
 * @author CXQ
 * @version 1.0
 */
public class PropertiesTest {
    class Student {
        public void studentInfo() {
            System.out.println("Im a Student...");
        }
    }
    class Teacher {
        public void teacherInfo() {
            System.out.println("Im a Teacher...");
        }
    }

    @Test
    public void properties() throws Exception{
        Properties properties = new Properties();
        String fileName = "D:/idea2018/idea/ideacode/com-javase-260/20200814/src/config.txt";
        FileReader fileReader = new FileReader(fileName);
        properties.load(fileReader);
        fileReader.close();
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");
        Class<?> klass = Class.forName(className);
        Object instance = klass.getDeclaredConstructor().newInstance();
        klass.getDeclaredMethod(methodName).invoke(instance);
    }
}





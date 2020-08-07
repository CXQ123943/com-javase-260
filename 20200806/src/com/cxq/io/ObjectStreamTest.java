package com.cxq.io;

import org.junit.Test;

import java.io.*;

/**
 * @author CXQ
 * @version 1.0
 */
class Student implements Serializable {
    private String name;

    /**属性不参与序列化过程，值不可见(为默认值)*/
    private transient Integer age;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    Integer getAge() {
        return age;
    }

    void setAge(Integer age) {
        this.age = age;
    }

}

public class ObjectStreamTest {

    @Test
    public void objectStream(){
        String filePath = "D:" + File.separator + "idea2018" + File.separator + "idea"+ File.separator + "student.txt";
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
             ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))){

            Student student = new Student();
            student.setName("赵四");
            student.setAge(18);
            objectOutputStream.writeObject(student);
            objectOutputStream.flush();
            System.out.println("写入完成！");

            Student o = (Student) objectInputStream.readObject();
            System.out.println("name：" + o.getName());
            System.out.println("age：" + o.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

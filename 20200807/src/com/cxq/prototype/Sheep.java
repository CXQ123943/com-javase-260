package com.cxq.prototype;

import java.io.*;
import java.util.Date;

/**
 * @author CXQ
 * @version 1.0
 */
public class Sheep implements Cloneable, Serializable{
    private String name;
    private Date birth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Sheep shallowClone(Sheep sheep){
        Sheep result = null;
        try {
            result = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
            return result;
    }


    public Sheep multipleShallowClone(Sheep sheep) {
        Sheep result = null;
        try {
            result = (Sheep) super.clone();
            Date date = (Date)sheep.birth.clone();
            sheep.setBirth(date);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return result;
    }

    public Sheep deepClone(Sheep sheep) {
        Sheep result = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(sheep);
            oos.flush();
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ois = new ObjectInputStream(bais);
            result = (Sheep) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}

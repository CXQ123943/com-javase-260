package com.cxq.prototype;

import java.util.Date;

/**
 * @author CXQ
 * @version 1.0
 */
public class Sheep implements Cloneable{
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
}

package com.steven.pojo;

import java.io.Serializable;

/**
 * @author StevenChen
 * @version 1.0
 */
public class Manager extends EmployeePojo implements Serializable {

    private double bonus = 200;

    public Manager() {
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

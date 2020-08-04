package com.steven.pojo;

import java.io.Serializable;

/**
 * @author StevenChen
 * @version 1.0
 */
public class EmployeePojo implements Serializable {
    private double salary = 2000;

    public EmployeePojo() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

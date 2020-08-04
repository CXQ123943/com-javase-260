package com.steven.myenum;

/**
 * @author CXQ
 * @version 1.0
 */
public enum Week {
    /**星期一到星期日*/
    MON, TUE, WED, THU, FRI, SAT, SUN;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

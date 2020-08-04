package com.steven.myenum;

/**
 * @author CXQ
 * @version 1.0
 */
public enum Element {
    /**
     * 元素
     */
    EARTH, VIND,
    FIRE {
        public String info() {
            return "Hot";
        }
    };

    public String into() {
        return "element";
    }
}

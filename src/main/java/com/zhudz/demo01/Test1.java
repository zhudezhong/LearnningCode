package com.zhudz.demo01;

public class Test1 implements Cloneable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Test1() {
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

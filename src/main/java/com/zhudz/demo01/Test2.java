package com.zhudz.demo01;

public class Test2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Test1 test1 = new Test1();
        test1.setName("zs");

        Test1 clone = (Test1) test1.clone();
        clone.setName("ls");

        System.out.println("t1:  "+test1.getName());
        System.out.println("clone: "+clone.getName());

    }
}

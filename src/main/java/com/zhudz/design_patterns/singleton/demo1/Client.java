package com.zhudz.design_patterns.singleton.demo1;

import com.zhudz.design_patterns.singleton.demo1.Singleton;

public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}

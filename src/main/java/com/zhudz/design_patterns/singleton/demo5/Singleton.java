package com.zhudz.design_patterns.singleton.demo5;

/**
 * 懒汉式4：    静态内部类方式
 */
public class Singleton {
    private Singleton(){};

    //定义一个静态内部类
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}

package com.zhudz.design_patterns.singleton.demo1;

/**
 * 1. 单例模式的实现
 *       1.1 饿汉式：类加载就会导致该单实例对象被创建
 *       1.2 懒汉式：类加载不会导致该单实例对象被创建，而是首次使用该对象时才会创建
 *
 */
public class Singleton {
    //饿汉式 - 方式一（静态变量方式）

    /**
     * 1. 私有化构造方法
     */
    private Singleton(){};

    /**
     * 2. 在成员变量中创建本类对象
     */
    private static Singleton instance = new Singleton();

    /**
     * 3. 提供一个公共的创建实例的方法
     * @return
     */
    public static Singleton getInstance(){
        return instance;
    }
}

package com.zhudz.design_patterns.singleton.demo3;

/**
 * 懒汉式 方式一： 线程不安全
 */
public class Singleton {
    /**
     * 私有化构造方法
     */
    private Singleton(){};

    /**
     * 声明Singleton类型的变量
     */
    private static Singleton instance;

    /**
     * 对外提供Singleton类型的变量instance
     * 此方式未加锁，在多线程环境下不安全
     * @return
     */
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * 加上了锁，使其在多线程环境下是安全的
     * @return
     */
    public static synchronized Singleton getInstance1(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

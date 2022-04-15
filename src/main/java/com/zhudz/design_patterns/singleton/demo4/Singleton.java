package com.zhudz.design_patterns.singleton.demo4;

/**
 * 懒汉式3  双重检查锁方式
 */
public class Singleton {
    private  Singleton(){}

    private static volatile Singleton instance;

    public static Singleton getInstance(){
        //第一次判断，如果instance的值不为null，不需要抢占锁，直接返回对象
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

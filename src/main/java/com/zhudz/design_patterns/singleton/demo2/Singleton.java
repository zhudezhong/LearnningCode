package com.zhudz.design_patterns.singleton.demo2;

import javax.swing.plaf.synth.SynthTextAreaUI;

/**
 * 饿汗式 2 ： 静态代码块
 */
public class Singleton {
    /**
     * 私有构造方法
     */
    private Singleton(){};

    /**
     * 声明Singleton类型的变量
     */
    private static Singleton instance;

    /**
     * 在静态代码块中进行赋值
     */
    static {
        instance = new Singleton();
    }

    /**
     * 对外提供获取该类对象的方法
     * @return
     */
    public static Singleton getInstance(){
        return instance;
    }
}

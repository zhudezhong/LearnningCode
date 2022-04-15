package com.zhudz.design_patterns.factory.before;

/**
 * 抽象咖啡类
 */
public abstract class Coffee {
    /**
     * 抽象方法，获取咖啡的名字
     * @return
     */
    abstract String getName();

    /**
     * 咖啡牛奶
     */
    void addMilk(){
        System.out.println("加牛奶");
    };

    /**
     * 咖啡加糖
     */
    void addSugar(){
        System.out.println("加糖");
    };
}

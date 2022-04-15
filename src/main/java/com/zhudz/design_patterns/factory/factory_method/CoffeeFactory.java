package com.zhudz.design_patterns.factory.factory_method;

/**
 * 抽象工厂类
 */
public interface CoffeeFactory {
    /**
     * 生产咖啡的方法
     * @return
     */
    Coffee createCoffee();
}

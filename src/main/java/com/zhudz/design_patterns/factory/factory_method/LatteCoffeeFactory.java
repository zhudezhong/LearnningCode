package com.zhudz.design_patterns.factory.factory_method;

/**
 * 拿铁咖啡工厂
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}

package com.zhudz.design_patterns.factory.simple_factory;

/**
 * 咖啡店，提供点咖啡功能
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type) throws Exception {
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);

        //加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}

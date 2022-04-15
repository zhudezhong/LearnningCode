package com.zhudz.design_patterns.factory.before;

/**
 * 咖啡店，提供点咖啡功能
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type) throws Exception {
        Coffee coffee = null;
        if ("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if ("latte".equals(type)){
            coffee = new LatteCoffee();
        }else {
            throw new Exception("不好意思，您点的咖啡没有！");
        }

        //加配料
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}

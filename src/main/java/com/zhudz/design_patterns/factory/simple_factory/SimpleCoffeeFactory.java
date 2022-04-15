package com.zhudz.design_patterns.factory.simple_factory;

public class SimpleCoffeeFactory {
    public static Coffee createCoffee(String type) throws Exception {
        Coffee coffee = null;
        if ("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if ("latte".equals(type)){
            coffee = new LatteCoffee();
        }else {
            throw new Exception("不好意思，您点的咖啡没有！");
        }


        return coffee;
    }
}

package com.zhudz.design_patterns.factory.simple_factory;

public class Client {
    public static void main(String[] args) throws Exception {
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("american");


        System.out.println(coffee.getName());
    }
}

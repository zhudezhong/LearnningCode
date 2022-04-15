package com.zhudz.design_patterns.factory.factory_method;

public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        store.setFactory(new LatteCoffeeFactory());

        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());
    }
}

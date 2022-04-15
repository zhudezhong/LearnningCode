package com.zhudz.design_patterns.factory.before;

public class Client {
    public static void main(String[] args) throws Exception {
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("latte");


        System.out.println(coffee.getName());
    }
}

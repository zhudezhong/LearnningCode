package com.zhudz.design_patterns.factory.factory_method;



/**
 * 咖啡店，提供点咖啡功能
 */
public class CoffeeStore {
    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory){
        this.factory = factory;
    }

    public Coffee orderCoffee(){
        //点咖啡
        Coffee coffee = factory.createCoffee();

        //加配料
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}

package com.test.test;

import com.test.DecoratorPattern.Breverage;
import com.test.DecoratorPattern.Expresso;
import com.test.DecoratorPattern.HouseBlend;
import com.test.DecoratorPattern.Mocha;

public class StarbuzzCoffee {
    public static void main (String args[]) {
        Breverage beverage = new Expresso();
        System.out.println(beverage.getDescription() + beverage.cost());
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + beverage.cost());
        Breverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + beverage1.cost());
    }
}

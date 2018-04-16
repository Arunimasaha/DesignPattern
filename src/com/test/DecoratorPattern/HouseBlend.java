package com.test.DecoratorPattern;

public class HouseBlend extends Breverage {
    public HouseBlend()
    {
        description = "House blend coffee";
    }

    @Override
    public double cost() {
        return .5;
    }
}

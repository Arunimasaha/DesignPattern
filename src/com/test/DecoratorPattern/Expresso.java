package com.test.DecoratorPattern;

public class Expresso extends Breverage{
    public Expresso()
    {
        description = "Expresso";
    }

    @Override
    public double cost() {
        return .90;
    }
}

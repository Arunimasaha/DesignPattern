package com.test.DecoratorPattern;

public class Mocha extends  CondinmentDecorator{
    Breverage breverage;
    public Mocha(Breverage breverage)
    {
        this.breverage = breverage;
    }

    public String getDescription()
    {
        return breverage.getDescription() + "Mocha";
    }

    @Override
    public double cost() {
        return breverage.cost() + .2;
    }
}

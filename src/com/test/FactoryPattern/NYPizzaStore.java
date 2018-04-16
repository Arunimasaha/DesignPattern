package com.test.FactoryPattern;

public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String item)
    {
        if (item.equals("cheese"))
        {
            return new NYStyleCheesePizza();
        }
        else if (item.equals("clam"))
        {
            return new NYStyleClamPizza();
        }
        else
            return null;
    }
}

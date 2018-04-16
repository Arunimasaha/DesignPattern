package com.test.FactoryPattern;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza()
    {
        name = "NY Style sauce";
        dough = "Thin crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}

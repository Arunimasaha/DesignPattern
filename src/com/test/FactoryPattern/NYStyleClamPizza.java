package com.test.FactoryPattern;

public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza()
    {
        name = "Ny style clam";
        dough = "thin crust Dough";
        sauce = "tomato sauce";

        toppings.add("clams");
    }
}

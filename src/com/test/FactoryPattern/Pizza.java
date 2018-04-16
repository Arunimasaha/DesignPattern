package com.test.FactoryPattern;

import java.util.ArrayList;

public class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare()
    {
        System.out.println("preparing" + name);
        System.out.println("Tossing dough" + dough);
        System.out.println("Adding sauce" +  sauce);
        System.out.println("Adding toppings");
        for(int i =0 ; i<toppings.size(); i++)
        {
            System.out.println(" "+ toppings.get(i));
        }
    }

    void bake()
    {
        System.out.println("Bake for 25 mins");
    }

    void cut()
    {
        System.out.println("cutting pizza into diagonal sizes");
    }

    void box()
    {
        System.out.println("place pizza in official PizzaStore box");
    }

    public String getName()
    {
        return name;
    }
}

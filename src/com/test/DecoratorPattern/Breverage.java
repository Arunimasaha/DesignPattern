package com.test.DecoratorPattern;

public abstract class Breverage {
 String description = "Unknown breverage";

 public String getDescription()
 {
     return description;
 }

 public abstract double cost();

}

package com.wipro.test.model;


import com.wipro.test.properties.CannotFly;

public class Chicken extends Bird implements CannotFly {
   
   
    public void speaking() {
        System.out.println("Cluck, cluck");
    }
    
    @Override
    public void walking() {
        super.walking();
    }

   
    public void cannotFly() {
        System.out.println("I cannot fly");
    }
}

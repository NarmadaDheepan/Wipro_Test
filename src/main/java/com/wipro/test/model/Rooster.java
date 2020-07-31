package com.wipro.test.model;


public class Rooster extends Chicken {


    public void speaking() {
    	System.out.println("Cock-a-doodle-doo");
    }
    
    @Override
    public void flying() {
        super.flying();
    }

 
}


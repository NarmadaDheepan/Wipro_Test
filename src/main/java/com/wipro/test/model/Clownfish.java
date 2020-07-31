package com.wipro.test.model;



public class Clownfish extends Fish {


    @Override
    public String size() {
        return "small";
    }

    @Override
    public String color() {
        return "orange";
    }

    public void joke() {
        System.out.println("I am joking");
    }
}

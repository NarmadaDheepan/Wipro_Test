package com.wipro.test.model;

public class Shark extends Fish {


    @Override
    public String size() {
        return "large";
    }

    @Override
    public String color() {
        return "grey";
    }

    public void canEat() {
        System.out.println("I eat fish");
    }
}

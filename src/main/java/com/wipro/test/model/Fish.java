package com.wipro.test.model;


import com.wipro.test.properties.BodyStructure;
import com.wipro.test.properties.Swim;

public class Fish extends Animal implements Swim, BodyStructure {
    public void swimming() {
        System.out.println("I am swimming");
    }

    public String size() {
        return null;
    }

    public String color() {
        return null;
    }
}

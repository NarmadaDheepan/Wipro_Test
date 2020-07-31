package com.wipro.test.model;

import com.wipro.test.properties.Fly;
import com.wipro.test.properties.Speak;
import com.wipro.test.properties.Walk;

public class Insect extends Animal implements Fly, Walk, Speak {
 
    public void flying() {
        System.out.println("I am flying");
    }

    public void speaking() {
    	System.out.println("I am speaking");
    }

    public void walking() {
        System.out.println("I am walking");
    }
}

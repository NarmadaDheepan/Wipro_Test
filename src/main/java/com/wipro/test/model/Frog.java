package com.wipro.test.model;

import com.wipro.test.properties.Speak;
import com.wipro.test.properties.Swim;
import com.wipro.test.properties.Walk;

public class Frog extends Animal implements Swim, Walk, Speak {

    public void speaking() {
    	System.out.println("I am speaking");
    }

    public void swimming() {
        System.out.println("I am swimming");
    }

    public void walking() {
        System.out.println("I am walking");
    }
}

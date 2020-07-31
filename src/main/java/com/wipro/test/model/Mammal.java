package com.wipro.test.model;

import com.wipro.test.properties.Speak;
import com.wipro.test.properties.Walk;

public abstract class Mammal extends Animal implements Walk, Speak {
 

    public void speaking() {
    	 System.out.println("I am speaking");
    }

    public void walking() {
        System.out.println("I am walking");
    }
}

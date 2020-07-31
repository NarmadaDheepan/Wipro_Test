package com.wipro.test.model;

import com.wipro.test.properties.Fly;
import com.wipro.test.properties.Speak;
import com.wipro.test.properties.Walk;

public class Bird extends Animal implements Walk, Speak, Fly {

   
    public void speaking() {
        System.out.println("I am speaking");
    }
    
    public void walking() {
        System.out.println("I am walking");
    }


    public void flying() {
        System.out.println("I am flying");
    }
}

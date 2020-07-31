package com.wipro.test.model;


import com.wipro.test.properties.Fly;
import com.wipro.test.properties.Speak;

public class Parrot extends Bird implements Fly, Speak {
   
	 public void speaking() {
	        System.out.println("I am speaking");
	    }

    public void flying() {
    	System.out.println("I am flying");
    }
}

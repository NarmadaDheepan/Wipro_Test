package com.wipro.test.model;

import com.wipro.test.properties.Swim;

public class Dolphin extends Animal implements Swim {
    public void swimming() {
        System.out.println("I am swimming");
    }
}

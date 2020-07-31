package com.wipro.test.model;

import com.wipro.test.properties.Fly;
import com.wipro.test.properties.Swim;

public class Duck extends Bird implements Swim, Fly {

	public void speaking() {
        System.out.println("Quack, quack");
    }

    @Override
    public void walking() {
        super.walking();
    }

    public void flying() {
        System.out.println("I am flying");
    }

    public void swimming() {
        System.out.println("I am swimming");
    }
}

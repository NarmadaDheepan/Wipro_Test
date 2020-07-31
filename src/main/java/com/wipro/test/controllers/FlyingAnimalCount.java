package com.wipro.test.controllers;

import com.wipro.test.model.Animal;
import com.wipro.test.properties.Fly;
import com.wipro.test.properties.Speak;
import com.wipro.test.properties.Swim;
import com.wipro.test.properties.Walk;


public class FlyingAnimalCount {
    Animal[] animals;
    int flyingAnimal = 0;
    int walkingAnimal = 0;
    int speakingAnimal = 0;
    int swimingAnimal = 0;


    public FlyingAnimalCount(Animal[] animals) {
        this.animals = animals;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Fly) {
                flyingAnimal += 1;
            }
            if (animals[i] instanceof Walk) {
                walkingAnimal += 1;
            }
            if (animals[i] instanceof Speak) {
                speakingAnimal += 1;
            }
            if (animals[i] instanceof Swim) {
                swimingAnimal += 1;
            }
        }
    }

    public int getFlyingAnimal() {
        return flyingAnimal;
    }

    public void setFlyingAnimal(int flyingAnimal) {
        this.flyingAnimal = flyingAnimal;
    }

    public int getWalkingAnimal() {
        return walkingAnimal;
    }

    public void setWalkingAnimal(int walkingAnimal) {
        this.walkingAnimal = walkingAnimal;
    }

    public int getSpeakingAnimal() {
        return speakingAnimal;
    }

    public void setSpeakingAnimal(int speakingAnimal) {
        this.speakingAnimal = speakingAnimal;
    }

    public int getSwimingAnimal() {
        return swimingAnimal;
    }

    public void setSwimingAnimal(int swimingAnimal) {
        this.swimingAnimal = swimingAnimal;
    }
}

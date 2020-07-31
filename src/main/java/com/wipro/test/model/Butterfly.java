package com.wipro.test.model;

import com.wipro.test.properties.CannotFly;
import com.wipro.test.properties.CannotSpeak;
import com.wipro.test.properties.Fly;
import com.wipro.test.properties.Speak;

public class Butterfly extends Insect {
   
    private class MetaButterfly extends Insect implements Fly, CannotSpeak {

       
        public void cannotSpeak() {
        	System.out.println("I cannot speak");
        }

        @Override
        public void flying() {
            super.flying();
        }
    }

    private class MetaCaterpillar extends Insect implements Speak, CannotFly {

        @Override
        public void speaking() {
            super.speaking();
        }

        @Override
        public void cannotFly() {
            System.out.println("I cannot fly");
        }
    }
}

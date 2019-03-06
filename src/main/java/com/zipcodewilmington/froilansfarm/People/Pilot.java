package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.*;
import com.zipcodewilmington.froilansfarm.PersonDecorator;


public class Pilot extends PersonDecorator implements Rider, Person {

    private Aircraft aircraft;

    public Pilot(Person person, Aircraft aircraft){
        super(person);
        this.aircraft = aircraft;
    }

    @Override
    public void mount(Rideable rideable) {

    }

    @Override
    public void dismount(Rideable rideable) {

    }

    @Override
    public void eat(Edible e) {

    }


    @Override
    public String makeNoise() {
        return null;
    }

}

package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.*;


public class Pilot extends Person implements Rider {

    private Aircraft aircraft;

    public Pilot(Aircraft aircraft){
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

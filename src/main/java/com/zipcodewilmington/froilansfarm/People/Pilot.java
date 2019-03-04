package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Pilot implements Rider, Person {

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

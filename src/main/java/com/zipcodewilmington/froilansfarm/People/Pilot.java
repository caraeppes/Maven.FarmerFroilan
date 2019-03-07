package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.*;
import com.zipcodewilmington.froilansfarm.PersonDecorator;

import java.util.List;


public class Pilot extends PersonDecorator implements Rider, Person {

    private Aircraft aircraft;

    public Pilot(Person person){
        super(person);
    }

    @Override
    public void mount(Rideable rideable) {
        rideable.setMounted(true);

    }

    @Override
    public void dismount(Rideable rideable) {
        rideable.setMounted(false);

    }


    @Override
    public void eat(Edible e) {
        decoratedPerson.eat(e);
    }

    @Override
    public List<Edible> getFoodEaten() {
        return decoratedPerson.getFoodEaten();
    }


    @Override
    public String makeNoise() {
        return null;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    @Override
    public void feed(Eater eater, Edible edible) {
        decoratedPerson.feed(eater, edible);
    }


}


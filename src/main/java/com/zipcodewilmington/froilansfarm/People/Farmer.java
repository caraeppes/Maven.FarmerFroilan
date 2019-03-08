package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.*;
import com.zipcodewilmington.froilansfarm.PersonDecorator;

import java.util.List;

public class Farmer extends PersonDecorator implements Rider, Botanist, Person {

    private Farm farm;

    public Farmer(Person person, Farm farm){
        super(person);
        this.farm = farm;
    }


    @Override
    public void plant(Crop crop, CropRow cropRow) {
        cropRow.addCrop(crop);

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
        return "Howdy! I'm a Farmer!";
    }

    public Farm getFarm() {
        return farm;
    }

    @Override
    public void feed(Eater eater, Edible edible) {
        decoratedPerson.feed(eater, edible);
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }
}

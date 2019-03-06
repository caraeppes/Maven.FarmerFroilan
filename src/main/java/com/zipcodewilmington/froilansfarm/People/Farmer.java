package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.*;
import com.zipcodewilmington.froilansfarm.PersonDecorator;

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

    public Farm getFarm() {
        return farm;
    }
}

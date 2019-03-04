package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.*;

import java.util.List;

public class Farmer implements Rider, Botanist, Person {

    private Farm farm;

    public Farmer(Farm farm){
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
    public void rideAllHorses() {

    }

    @Override
    public void eat(Edible e) {

    }

    @Override
    public List<Edible> getEdiblesEaten() {
        return null;
    }

    @Override
    public String makeNoise() {
        return null;
    }

    public Farm getFarm() {
        return farm;
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }

    public void eatFroilansBreakfast() {
    }

    @Override
    public void feedAllHorses(int i) {

    }
}

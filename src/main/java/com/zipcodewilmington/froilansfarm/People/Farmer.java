package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.*;

public class Farmer extends Person implements Rider, Botanist {

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
    public void eat(Edible e) {

    }


    @Override
    public String makeNoise() {
        return null;
    }


}

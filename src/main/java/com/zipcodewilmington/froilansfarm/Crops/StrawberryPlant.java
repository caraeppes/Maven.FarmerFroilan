package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edibles.Strawberry;

public class StrawberryPlant extends Crop {

    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;

    public StrawberryPlant(boolean hasBeenHarvested, boolean hasBeenFertilized) {
        super(hasBeenHarvested, hasBeenFertilized);
    }

    @Override
    public Strawberry yield(){
        if(hasBeenFertilized && hasBeenHarvested){
            return new Strawberry();
        }
        else{
            return null;
        }
    }

}

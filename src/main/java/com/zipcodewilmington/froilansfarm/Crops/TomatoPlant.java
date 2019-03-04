package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edibles.Crop;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;

public class TomatoPlant extends Crop {

    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;

    public TomatoPlant(boolean hasBeenHarvested, boolean hasBeenFertilized) {
        super(hasBeenHarvested, hasBeenFertilized);
    }

    @Override
    public Tomato yield(){
        if(hasBeenFertilized && hasBeenHarvested){
            return new Tomato();
        }
        else{
            return null;
        }
    }

}

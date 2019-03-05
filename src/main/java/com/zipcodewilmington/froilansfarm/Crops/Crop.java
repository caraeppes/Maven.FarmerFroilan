package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Crops.Produce;

public abstract class Crop extends Produce {

    private boolean hasBeenHarvested;
    private boolean hasBeenFertilized;

    public Crop(boolean hasBeenHarvested, boolean hasBeenFertilized){
        super(hasBeenFertilized);
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public abstract Edible yield();

   }

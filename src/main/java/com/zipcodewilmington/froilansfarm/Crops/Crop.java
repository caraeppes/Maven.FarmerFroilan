package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Crops.Produce;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;

public abstract class Crop extends Produce {

    private boolean hasBeenHarvested;
    private boolean hasBeenFertilized;

    public Crop(boolean hasBeenHarvested){
        super();
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public abstract Edible yield();

    public boolean hasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public boolean hasBeenFertilized() {
        return hasBeenFertilized;
    }

}

package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Crops.Produce;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;

public abstract class Crop extends Produce {

    private boolean hasBeenHarvested;
    private boolean hasBeenFertilized;




    public Crop(boolean hasBeenHarvested, boolean hasBeenFertilized){
        super(hasBeenFertilized);
        this.hasBeenHarvested = hasBeenHarvested;
    }




    public abstract Edible yield();

    public boolean isHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {


        this.hasBeenFertilized = hasBeenFertilized;
    }

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

}

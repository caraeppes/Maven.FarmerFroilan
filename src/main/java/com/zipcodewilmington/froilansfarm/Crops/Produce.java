package com.zipcodewilmington.froilansfarm.Crops;


import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public abstract class Produce {

    private boolean hasBeenFertilized;

    public Produce(){
        hasBeenFertilized = false;
    }

    public boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public abstract Edible yield() throws Exception;

}

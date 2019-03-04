package com.zipcodewilmington.froilansfarm.Crops;


public abstract class Produce {

    private boolean hasBeenFertilized;

    public Produce(boolean hasBeenFertilized){
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }
}

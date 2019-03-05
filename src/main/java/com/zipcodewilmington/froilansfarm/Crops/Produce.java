package com.zipcodewilmington.froilansfarm.Crops;


import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public abstract class Produce {

    private boolean hasBeenFertilized;

    public Produce(boolean hasBeenFertilized){
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public abstract Edible yield();
}

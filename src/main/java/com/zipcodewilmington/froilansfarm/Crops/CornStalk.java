package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edibles.Crop;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;

public class CornStalk extends Crop {

    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;

    public CornStalk(boolean hasBeenHarvested, boolean hasBeenFertilized) {
        super(hasBeenHarvested, hasBeenFertilized);
    }


    @Override
    public EarCorn yield() {
        if(hasBeenFertilized && hasBeenHarvested){
            return new EarCorn();
        }
        else {
            return null;
        }
    }

}

package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;

public class CornStalk extends Crop {

    private boolean hasBeenFertilized;
    private boolean hasBeenHarvested;

    public CornStalk(boolean hasBeenHarvested, boolean hasBeenFertilized) {
        super(hasBeenHarvested, hasBeenFertilized);
    }


    @Override
    public EarCorn yield() {
        return null;
    }

}

package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;

public class CornStalk extends Crop {

    private boolean hasBeenFertilized = false;
    private boolean hasBeenHarvested = false;

    public CornStalk(boolean hasBeenHarvested, boolean hasBeenFertilized) {
        super(hasBeenHarvested, hasBeenFertilized);
    }

    public CornStalk(){
        super(false, false);

    }

    @Override
    public EarCorn yield() {
        return null;
    }

}

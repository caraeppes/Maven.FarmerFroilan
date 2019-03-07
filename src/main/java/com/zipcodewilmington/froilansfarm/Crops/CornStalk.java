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


    @Override
    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    @Override
    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    @Override
    public boolean isHasBeenHarvested() {
        return hasBeenHarvested;
    }

    @Override
    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }
}

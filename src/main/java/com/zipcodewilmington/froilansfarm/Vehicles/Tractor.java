package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class Tractor implements FarmVehicle {

    private boolean isMounted = false;

    public Edible harvest(Crop crop){
        crop.setHasBeenHarvested(true);
        return crop.yield();
    }

    @Override
    public void operate(Farm farm) {

    }

    @Override
    public String makeNoise() {

        return null;
    }

    @Override
    public int getTimesRidden() {
        return 0;
    }

    @Override
    public void setTimesRidden(int timesRidden) {

    }

    @Override
    public boolean isMounted() {
        return isMounted;
    }
}

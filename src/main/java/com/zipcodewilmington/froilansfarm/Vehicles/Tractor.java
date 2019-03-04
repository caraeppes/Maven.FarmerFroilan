package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Edibles.Crop;
import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class Tractor implements FarmVehicle {

    public Crop harvest(Crop crop){
        crop.setHasBeenHarvested(true);
        return (Crop) crop.yield();
    }

    @Override
    public void operate(Farm farm) {

    }

    @Override
    public String makeNoise() {

        return null;
    }

}

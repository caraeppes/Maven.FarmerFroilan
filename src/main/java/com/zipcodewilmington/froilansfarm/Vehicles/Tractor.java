package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class Tractor extends FarmVehicle {

    public Edible harvest(Crop crop){
        return null;
    }

    @Override
    public void operate(Farm farm) {

    }

    @Override
    public String makeNoise() {

        return null;
    }

}

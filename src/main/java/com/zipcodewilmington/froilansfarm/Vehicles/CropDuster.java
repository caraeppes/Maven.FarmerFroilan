package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class CropDuster extends FarmVehicle implements Aircraft {

    public void fertilize(CropRow cropRow){}

    @Override
    public void fly() {
    }


    @Override
    public void operate(Farm farm) {

    }

    @Override
    public String makeNoise() {

        return null;
    }

}

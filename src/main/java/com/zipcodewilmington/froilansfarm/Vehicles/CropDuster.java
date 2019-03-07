package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;

public class CropDuster extends FarmVehicle implements Aircraft {

    private boolean isMounted = false;

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


    @Override
    public boolean isMounted() {
        return isMounted;
    }

    @Override
    public void setMounted(boolean isMounted) {
        this.isMounted = isMounted;

    }



}

package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class CropDuster implements FarmVehicle, Aircraft {

    private boolean isMounted = false;
    private boolean isFlying = false;

    public void fertilize(CropRow cropRow){
        for(Crop crop: cropRow.getCrops()){
            crop.setHasBeenFertilized(true);
        }
    }

    @Override
    public void fly() {
        isFlying = true;
    }

    @Override
    public boolean isFlying() {
        return isFlying;
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

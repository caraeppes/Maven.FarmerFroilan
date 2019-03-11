package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;


public class CropDuster extends FarmVehicle implements Aircraft, Rideable {

    private boolean isFlying = false;

    public void fertilize(CropRow cropRow) {
            cropRow.setHasBeenFertilized(true);
    }


    @Override
    public void fly() {
        if (isMounted()) {
            setFlying(true);
        }
    }

    @Override
    public void setFlying(boolean isFlying) {
        this.isFlying = isFlying;
    }

    @Override
    public boolean isFlying() {
        return isFlying;
    }


    @Override
    public void operate(Farm farm) {
        if(isFlying){
            makeNoise();
            for(CropRow cropRow : farm.getField().getCropRows()){
                fertilize(cropRow);
            }
        }
    }

    @Override
    public String makeNoise() {
        return "grrr";
    }

}

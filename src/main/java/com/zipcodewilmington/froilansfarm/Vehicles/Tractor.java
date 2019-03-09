package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.FarmStructures.Silo;

public class Tractor extends FarmVehicle {

    public void harvest(Crop crop, Silo silo) {

        if (crop.isHasBeenFertilized() && !crop.isHasBeenHarvested()) {
            crop.setHasBeenHarvested(true);
            silo.add(crop.yield());
        }
        else {
            if(!crop.isHasBeenFertilized()){
                System.out.println("Cannot harvest a crop that has not been fertilized.");
            }
            if(crop.isHasBeenHarvested()){
                System.out.println("Cannot harvest a crop that has already been harvested.");
            }
        }
    }

    @Override
    public void operate(Farm farm) {
        if (isMounted()){
            makeNoise();
            for(CropRow cropRow : farm.getField().getCropRows()){
                for(Crop crop : cropRow.getCrops()){
                    harvest(crop, farm.getSilo());
                }
            }
        }
    }

    @Override
    public String makeNoise() {
        return "Chug-chug-chug!";
    }
}

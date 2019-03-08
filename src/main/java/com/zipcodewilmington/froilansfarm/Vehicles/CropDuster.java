package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;


import java.util.ArrayList;
import java.util.List;

public class CropDuster extends FarmVehicle implements Aircraft, Rideable {

    private boolean isMounted = false;


    public List<CropRow> getCroprowlist() {
        return croprowlist;
    }


    private List<CropRow> croprowlist = new ArrayList<>();


    public void fertilize(CropRow cropRow) {


            if (isMounted = true) {

                croprowlist.add(cropRow);


              cropRow.setHasBeenFertilized(true);

            }

        }


    @Override
    public void fly() {

    }


    @Override
    public void operate(Farm farm) {


    }

    @Override
    public String makeNoise() {

        return "grrr";
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

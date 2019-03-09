package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;


import java.util.ArrayList;
import java.util.List;

public class CropDuster extends FarmVehicle implements Aircraft, Rideable {

    public List<CropRow> getCroprowlist() {
        return croprowlist;
    }


    private List<CropRow> croprowlist = new ArrayList<>();


    public void fertilize(CropRow cropRow) {


            if (isMounted()) {

                croprowlist.add(cropRow);


              cropRow.setHasBeenFertilized(true);

              setMounted(false);

            }

        }


    @Override
    public void fly() {


        setMounted(true);


    }


    @Override
    public void operate(Farm farm) {


    }

    @Override
    public String makeNoise() {

        return "grrr";
    }

}

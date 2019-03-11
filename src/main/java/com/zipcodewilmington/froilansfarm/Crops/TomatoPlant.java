package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edibles.Tomato;

public class TomatoPlant extends Crop {

    public TomatoPlant(){
        super(false);
    }

    @Override
    public Tomato yield(){
        return new Tomato();
    }
}

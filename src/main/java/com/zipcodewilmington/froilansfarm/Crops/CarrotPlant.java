package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edibles.Carrot;

public class CarrotPlant extends Crop {

    public CarrotPlant() {
        super(false);
    }

    @Override
    public Carrot yield() {
        return new Carrot();
    }

}

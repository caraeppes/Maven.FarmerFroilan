package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;

public class CornStalk extends Crop {

    public CornStalk(){
        super(false);
    }

    @Override
    public EarCorn yield() {
        return new EarCorn();
    }
}

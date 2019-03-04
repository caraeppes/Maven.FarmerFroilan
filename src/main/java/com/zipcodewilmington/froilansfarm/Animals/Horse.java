package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Animal;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Horse implements Rideable, Animal {

    int cornEaten = 0;


    @Override
    public void eat(Edible e) {
        if(e instanceof EarCorn){
            cornEaten++;
        }
    }

    @Override
    public String makeNoise() {

        return null;
    }

}

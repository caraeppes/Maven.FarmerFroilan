package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Animal;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

import java.util.List;

public class Horse implements Rideable, Animal {



    @Override
    public void eat(Edible e) {
    }

    @Override
    public String makeNoise() {

        return null;
    }
}

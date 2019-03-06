package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Animal;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public abstract class MilkableAnimals implements Animal {
    @Override
    public void eat(Edible e) {

    }

    @Override
    public String makeNoise() {
        return null;
    }

    public abstract void milk();
}

package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Edibles.Milk;
import com.zipcodewilmington.froilansfarm.Interfaces.Animal;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import java.util.ArrayList;
import java.util.List;

public abstract class MilkableAnimal implements Animal {

    List<Edible> foodEaten = new ArrayList<>();

    @Override
    public void eat(Edible e) {
        foodEaten.add(e);
    }

    public List<Edible> getFoodEaten(){
        return foodEaten;
    }

    public Milk milk(){
        return new Milk();
    }
}

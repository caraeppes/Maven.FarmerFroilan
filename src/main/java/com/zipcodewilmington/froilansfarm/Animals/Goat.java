package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import java.util.ArrayList;
import java.util.List;

public class Goat extends MilkableAnimals {

    @Override
    public void milk() {

    }

    @Override
    public List<Edible> getFoodEaten() {
        return null;
    }

    public static List<Goat> makeGoats(int numberOfGoats){
        List<Goat> goats = new ArrayList<>();
        for (int i = 0; i < numberOfGoats; i++) {
            goats.add(new Goat());
        }
        return goats;
    }
}

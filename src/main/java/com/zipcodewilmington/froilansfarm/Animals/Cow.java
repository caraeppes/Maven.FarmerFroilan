package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import java.util.ArrayList;
import java.util.List;

public class Cow extends MilkableAnimals {
    @Override
    public void milk() {

    }

    @Override
    public List<Edible> getFoodEaten() {
        return null;
    }


    public static List<Cow> makeCows(int numberOfCows){
        List<Cow> cows = new ArrayList<>();
        for (int i = 0; i < numberOfCows; i++){
            cows.add(new Cow());
        }
        return cows;
    }

}

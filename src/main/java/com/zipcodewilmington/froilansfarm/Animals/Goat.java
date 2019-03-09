package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.FarmStructures.Silo;

import java.util.ArrayList;
import java.util.List;

public class Goat extends MilkableAnimal {

    @Override
    public void milk(Silo silo) {

    }

    public static List<Goat> makeGoats(int numberOfGoats){
        List<Goat> goats = new ArrayList<>();
        for (int i = 0; i < numberOfGoats; i++) {
            goats.add(new Goat());
        }
        return goats;
    }

    public String makeNoise(){
        return "Meeehhhh!";
    }
}

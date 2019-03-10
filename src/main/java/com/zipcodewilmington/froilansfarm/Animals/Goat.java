package com.zipcodewilmington.froilansfarm.Animals;

import java.util.ArrayList;
import java.util.List;

public class Goat extends MilkableAnimal {

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

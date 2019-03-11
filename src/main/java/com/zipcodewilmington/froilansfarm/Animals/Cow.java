package com.zipcodewilmington.froilansfarm.Animals;

import java.util.ArrayList;
import java.util.List;

public class Cow extends MilkableAnimal {

    public static List<Cow> makeCows(int numberOfCows){
        List<Cow> cows = new ArrayList<>();
        for (int i = 0; i < numberOfCows; i++){
            cows.add(new Cow());
        }
        return cows;
    }

    @Override
    public String makeNoise(){
        return "Moooooo!";
    }
}

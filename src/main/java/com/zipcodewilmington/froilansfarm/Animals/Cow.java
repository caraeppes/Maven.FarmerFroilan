package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Edibles.Milk;
import com.zipcodewilmington.froilansfarm.FarmStructures.Silo;

import java.util.ArrayList;
import java.util.List;

public class Cow extends MilkableAnimal {
    @Override
    public void milk(Silo silo) {
        silo.getEdibles().add(yield());
    }

    public Milk yield(){
        return new Milk();
    }


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

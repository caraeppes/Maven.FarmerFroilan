package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Animal;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Edibles.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Crops.Produce;

import java.util.ArrayList;
import java.util.List;

public class Chicken extends Produce implements Animal {

    public Chicken(boolean hasBeenFertilized) {
        super(hasBeenFertilized);
    }

    public Chicken() {
        super(false);
    }

    public Edible yield() {
        return null;
    }


    @Override
    public void eat(Edible e) {

    }

    @Override
    public List<Edible> getFoodEaten() {
        return null;
    }

    @Override
    public String makeNoise() {

        return null;
    }

    public static  List<Chicken> makeChickens(int numberOfChickens){
        List<Chicken> chickens = new ArrayList<>();
        for (int i = 0; i < numberOfChickens; i++){
            chickens.add(new Chicken());
        }
        return chickens;
    }

}
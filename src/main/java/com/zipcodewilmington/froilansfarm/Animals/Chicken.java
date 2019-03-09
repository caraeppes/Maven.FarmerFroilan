package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Animal;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Edibles.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Crops.Produce;

import java.util.ArrayList;
import java.util.List;

public class Chicken extends Produce implements Animal {

    List<Edible> foodEaten = new ArrayList<>();

    public Chicken() {
        super();
    }

    public Edible yield() {
        if(!getHasBeenFertilized()){
            return new EdibleEgg();
        }
        return null;
    }

    @Override
    public void eat(Edible e) {
        foodEaten.add(e);
    }

    @Override
    public List<Edible> getFoodEaten() {
        return foodEaten;
    }

    @Override
    public String makeNoise() {
        return "Cluck-cluck-cluck!";
    }

    public static  List<Chicken> makeChickens(int numberOfChickens){
        List<Chicken> chickens = new ArrayList<>();
        for (int i = 0; i < numberOfChickens; i++){
            chickens.add(new Chicken());
        }
        return chickens;
    }

}
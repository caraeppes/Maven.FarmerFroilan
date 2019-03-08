package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Person;

import java.util.ArrayList;
import java.util.List;

public class BasicPerson implements Person {

    List<Edible> foodEaten;
    double wallet = 100.00;

    public BasicPerson() {
        this.foodEaten = new ArrayList<>();
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
        return null;
    }

    @Override
    public void feed(Eater eater, Edible edible) {
        eater.eat(edible);
    }

    public void setFoodEaten(List<Edible> foodEaten) {
        this.foodEaten = foodEaten;
    }
}

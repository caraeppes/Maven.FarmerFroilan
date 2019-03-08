package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Animal;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

import java.util.ArrayList;
import java.util.List;

public class Horse implements Rideable, Animal {

    private boolean isMounted = false;
    private List<Edible> foodEaten = new ArrayList<>();

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

        return "Neigh!";
    }

    public static List<Horse> makeHorses(int numberOfHorses){
        List<Horse> horses = new ArrayList<>();
        for (int i = 0; i < numberOfHorses; i++){
            horses.add(new Horse());
        }
        return horses;
    }

    @Override
    public boolean isMounted() {
        return isMounted;
    }

    public void setMounted(boolean mounted) {
        isMounted = mounted;
    }


}

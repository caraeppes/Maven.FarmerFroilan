package com.zipcodewilmington.froilansfarm.FarmStructures;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop {

    private List<Chicken> chickens = new ArrayList<>();

    public ChickenCoop(List<Chicken> chickens) {
        this.chickens = chickens;
    }

    public void addChicken(Chicken chicken){
        chickens.add(chicken);
    }

    public ChickenCoop(Integer numberOfChickens) {
        for(int i = 0; i < numberOfChickens; i++){
            addChicken(new Chicken(false));
        }
    }
}

package com.zipcodewilmington.froilansfarm.FarmStructures;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;

import java.util.List;

public class ChickenCoop extends Shelter<Chicken>{


    public ChickenCoop(List inhabitants) {
        super(inhabitants);
    }

    public ChickenCoop() {
        super();
    }

    public void addChickens(List<Chicken> chickenList){
       addAll(chickenList);
    }


}

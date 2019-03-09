package com.zipcodewilmington.froilansfarm.FarmStructures;

import com.zipcodewilmington.froilansfarm.Animals.Goat;

import java.util.ArrayList;
import java.util.List;

public class GoatStable extends Shelter<Goat> {

    public GoatStable(){
        super();
    }

    public void addGoats(List<Goat> goats){
        addAll(goats);
    }

    public List<Goat> getInhabitants(){
        List<Goat> goats = new ArrayList<>();
        for(Object o : super.getInhabitants()){
            goats.add((Goat) o );
        }

        return goats;
    }


}

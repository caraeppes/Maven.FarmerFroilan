package com.zipcodewilmington.froilansfarm.FarmStructures;

import com.zipcodewilmington.froilansfarm.Animals.Cow;
import com.zipcodewilmington.froilansfarm.Animals.Horse;

import java.util.ArrayList;
import java.util.List;

public class CowBarn extends Shelter<Cow>{

    public CowBarn(){
        super();
    }

    public CowBarn(List inhabitants) {
        super(inhabitants);
    }


    public void addCows(List<Cow> cows){
        addAll(cows);
    }

    public List<Cow> getInhabitants(){
        List<Cow> cows = new ArrayList<>();
        for(Object o : super.getInhabitants()){
            cows.add((Cow) o );
        }

        return cows;
    }


}

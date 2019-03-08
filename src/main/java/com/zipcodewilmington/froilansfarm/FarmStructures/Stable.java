package com.zipcodewilmington.froilansfarm.FarmStructures;


import com.zipcodewilmington.froilansfarm.Animals.Horse;

import java.util.ArrayList;
import java.util.List;

public class Stable extends Shelter {


    public Stable(){
        super();
    }

    public Stable(List inhabitants) {
        super(inhabitants);
    }


    public void addHorses(List<Horse> horses){
        addAll(horses);
    }

    public List<Horse> getInhabitants(){
        List<Horse> horses = new ArrayList<>();
        for(Object o : super.getInhabitants()){
            horses.add((Horse) o );
        }

        return horses;
    }


}

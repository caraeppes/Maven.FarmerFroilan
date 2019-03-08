package com.zipcodewilmington.froilansfarm.FarmStructures;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import java.util.ArrayList;
import java.util.List;

public class Silo extends Shelter<Edible> {

    public Silo(){
        super();
    }


    public void addEdibles(List<Edible> edibles){
        addAll(edibles);
    }

    public List<Edible> getEdibles(){
        List<Edible> edibles = new ArrayList<>();
        for(Object o : super.getInhabitants()){
            edibles.add((Edible) o );
        }
        return edibles;
    }


}

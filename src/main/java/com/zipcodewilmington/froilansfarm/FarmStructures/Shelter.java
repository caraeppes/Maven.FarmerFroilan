package com.zipcodewilmington.froilansfarm.FarmStructures;

import java.util.ArrayList;
import java.util.List;

public abstract class Shelter<T> {

    private List<T> inhabitants;

    public Shelter(){
        inhabitants = new ArrayList<>();
    }

    public Shelter(List<T> inhabitants) {
        this.inhabitants = inhabitants;
    }

    public void add(T inhabitant){
        inhabitants.add(inhabitant);
    }

    public List<T> getInhabitants() {
        return inhabitants;
    }


}

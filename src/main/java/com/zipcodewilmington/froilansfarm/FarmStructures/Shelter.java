package com.zipcodewilmington.froilansfarm.FarmStructures;

import java.util.List;

public abstract class Shelter<T> {

    private List<T> inhabitants;

    public Shelter(List<T> inhabitants) {
        this.inhabitants = inhabitants;
    }
}

package com.zipcodewilmington.froilansfarm.Interfaces;


import java.util.List;

public interface Eater {

    void eat(Edible e);

    List<Edible> getEdiblesEaten();
}

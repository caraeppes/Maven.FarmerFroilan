package com.zipcodewilmington.froilansfarm.FarmStructures;

import com.zipcodewilmington.froilansfarm.Edibles.*;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import java.util.ArrayList;
import java.util.List;

public class FarmStand {

    List<Carrot> basketOfCarrots = new ArrayList<>();
    List<Milk> basketOfMilk = new ArrayList<>();
    List<Tomato> basketOfTomato = new ArrayList<>();
    List<EarCorn> basketOfCorn = new ArrayList<>();
    List<EdibleEgg> basketOfEggs = new ArrayList<>();

    double moneyJar = 0;

    public FarmStand(){}

    public void sell(List<Edible> ediblesSold, List<Edible> basket){
        basket.removeAll(ediblesSold);
        moneyJar += (ediblesSold.size() * 1);
    }

}

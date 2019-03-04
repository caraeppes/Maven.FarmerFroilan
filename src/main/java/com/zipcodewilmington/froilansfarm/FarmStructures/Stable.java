package com.zipcodewilmington.froilansfarm.FarmStructures;

import com.zipcodewilmington.froilansfarm.Animals.Horse;

import java.util.ArrayList;
import java.util.List;

public class Stable {

    List<Horse> horses = new ArrayList<>();

    public Stable(Integer numberOfHorses) {
        for (int i = 0 ; i < numberOfHorses; i++){
            addHorse(new Horse());
        }
    }

    public void addHorse(Horse horse){
        horses.add(horse);
    }

    public List<Horse> getHorses() {
        return horses;
    }


    public void setHorses(List<Horse> horses) {
        this.horses = horses;
    }
}

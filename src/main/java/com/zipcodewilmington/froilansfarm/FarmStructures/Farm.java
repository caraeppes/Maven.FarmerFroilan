package com.zipcodewilmington.froilansfarm.FarmStructures;


import java.util.List;

public class Farm {

    private FarmHouse farmHouse;
    private List<ChickenCoop> chickenCoops;
    private List<Stable> stables;
    private Field field;


    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public void setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
    }

    public List<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public void setChickenCoops(List<ChickenCoop> chickenCoops) {
        this.chickenCoops = chickenCoops;
    }

    public List<Stable> getStables() {
        return stables;
    }

    public void setStables(List<Stable> stables) {
        this.stables = stables;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }
}

package com.zipcodewilmington.froilansfarm.FarmStructures;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    private FarmHouse farmHouse;
    private Field field;
    private List<ChickenCoop> chickenCoops;
    private List<Stable> stables;
    private List<FarmVehicle> farmVehicles;
    private List<Edible> harvestedCrops;

    public Farm() {
        this.farmHouse = new FarmHouse();
        this.field = new Field();
        this.chickenCoops = new ArrayList<>();
        this.stables = new ArrayList<>();
        this.farmVehicles = new ArrayList<>();
    }

    public Farm(FarmHouse farmHouse, Field field, List<ChickenCoop> chickenCoops, List<Stable> stables) {
        this.farmHouse = farmHouse;
        this.field = field;
        this.chickenCoops = chickenCoops;
        this.stables = stables;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public void setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
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

    public List<FarmVehicle> getFarmVehicles() {
        return farmVehicles;
    }

    public void setFarmVehicles(List<FarmVehicle> farmVehicles) {
        this.farmVehicles = farmVehicles;
    }

    public List<Horse> getAllHorses() {
        return null;
    }

    public List<Edible> getHarvestedCrops() {
        return harvestedCrops;
    }
}

package com.zipcodewilmington.froilansfarm.FarmStructures;

import com.zipcodewilmington.froilansfarm.Vehicles.FarmVehicle;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    private FarmHouse farmHouse;
    private List<ChickenCoop> chickenCoops;
    private List<Stable> stables;
    private Field field;
    private List<FarmVehicle> farmVehicles;
    private Silo silo;
    private List<GoatStable> goatStables;
    private List<CowBarn> cowBarns;
    private FarmStand farmStand;


    public Farm() {
        farmHouse = new FarmHouse();
        field = new Field();
        chickenCoops = new ArrayList<>();
        stables = new ArrayList<>();
        farmVehicles = new ArrayList<>();
        silo = new Silo();
        goatStables = new ArrayList<>();
        cowBarns = new ArrayList<>();
        farmStand = new FarmStand();

    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public void setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
    }

    public List<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public List<Stable> getStables() {
        return stables;
    }

    public Field getField() {
        return field;
    }

    public List<FarmVehicle> getFarmVehicles() {
        return farmVehicles;
    }

    public void setFarmVehicles(List<FarmVehicle> farmVehicles) {
        this.farmVehicles = farmVehicles;
    }

    public Silo getSilo() {
        return silo;
    }

    public List<GoatStable> getGoatStables() {
        return goatStables;
    }

    public List<CowBarn> getCowBarns() {
        return cowBarns;
    }

    public FarmStand getFarmStand() {
        return farmStand;
    }
}

package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Cow;
import com.zipcodewilmington.froilansfarm.Animals.Goat;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Crops.CarrotPlant;
import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.FarmStructures.*;
import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.Person;
import com.zipcodewilmington.froilansfarm.People.BasicPerson;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

import java.util.List;

public class FroilansFarm {

    private static final FroilansFarm INSTANCE = new FroilansFarm();
    private Farm farm;
    private Farmer froilan;
    private Pilot froilanda;
    private Field field;

    private FroilansFarm() {
        froilan = makeFroilan();
        froilanda = makeFroilanda();
        farmSetUp();
        fieldSetUp();
        setUpStructures();

    }

    public FroilansFarm testFroilansFarm(){
        return new FroilansFarm();
    }

    public static FroilansFarm getInstance(){
        return INSTANCE;
    }

    private Farmer makeFroilan() {
        Person froilan = new BasicPerson();
        return new Farmer(froilan, new Farm());
    }

    private Pilot makeFroilanda() {
        Person froilanda = new BasicPerson();
        return new Pilot(froilanda);
    }

    private void farmSetUp() {
        farm = froilan.getFarm();
        farm.setFarmVehicles(addFarmVehicles());
        farm.setFarmHouse(addFarmHouse());
    }

    private List<FarmVehicle> addFarmVehicles() {
        farm.getFarmVehicles().add(new Tractor());
        farm.getFarmVehicles().add(new CropDuster());
        froilanda.setAircraft((Aircraft) farm.getFarmVehicles().get(1));
        return farm.getFarmVehicles();
    }

    private FarmHouse addFarmHouse() {
        FarmHouse farmHouse = farm.getFarmHouse();
        farmHouse.add(froilan);
        farmHouse.add(froilanda);
        return farmHouse;
    }

    private void fieldSetUp() {
        field = farm.getField();
        makeCropRows();
        plantCrops();
    }

    private void makeCropRows() {
        for (int i = 0; i < 5; i++) {
            field.add(new CropRow());
        }
    }

    private void plantCrops() {
        froilan.plant(new CornStalk(), field.getCropRows().get(0));
        froilan.plant(new TomatoPlant(), field.getCropRows().get(1));
        froilan.plant(new CornStalk(), field.getCropRows().get(2));
        froilan.plant(new CarrotPlant(), field.getCropRows().get(3));
        froilan.plant(new TomatoPlant(), field.getCropRows().get(4));
    }

    private void setUpStructures() {
        chickenCoopSetUp();
        horseStableSetUp();
        cowBarnSetUp();
        goatStableSetUp();
    }

    private void chickenCoopSetUp() {
        makeChickenCoops();
        addChickens();
    }

    private void makeChickenCoops() {
        for (int i = 0; i < 4; i++) {
            farm.getChickenCoops().add(new ChickenCoop());
        }
    }

    private void addChickens() {
        List<Chicken> chickens = Chicken.makeChickens(15);
        farm.getChickenCoops().get(0).addAll(chickens.subList(0, 3));
        farm.getChickenCoops().get(1).addAll(chickens.subList(3, 7));
        farm.getChickenCoops().get(2).addAll(chickens.subList(7, 11));
        farm.getChickenCoops().get(3).addAll(chickens.subList(11, 15));
    }

    private void horseStableSetUp() {
        makeHorseStables();
        addHorses();
    }

    private void makeHorseStables() {
        for (int i = 0; i < 3; i++) {
            farm.getStables().add(new Stable());
        }
    }

    private void addHorses() {
        List<Horse> horses = Horse.makeHorses(10);
        farm.getStables().get(0).addAll(horses.subList(0, 3));
        farm.getStables().get(1).addAll(horses.subList(3, 6));
        farm.getStables().get(2).addAll(horses.subList(6, 10));
    }

    private void cowBarnSetUp() {
        makeCowBarns();
        addCows();
    }

    private void makeCowBarns() {
        farm.getCowBarns().add(new CowBarn());
        farm.getCowBarns().add(new CowBarn());
    }

    private void addCows() {
        List<Cow> cows = Cow.makeCows(20);
        farm.getCowBarns().get(0).addAll(cows.subList(0, 10));
        farm.getCowBarns().get(1).addAll(cows.subList(10, 20));
    }

    private void goatStableSetUp() {
        makeGoatStables();
        addGoats();
    }

    private void makeGoatStables() {
        for (int i = 0; i < 3; i++) {
            farm.getGoatStables().add(new GoatStable());
        }
    }

    private void addGoats() {
        List<Goat> goats = Goat.makeGoats(9);
        farm.getGoatStables().get(0).addAll(goats.subList(0, 3));
        farm.getGoatStables().get(1).addAll(goats.subList(3, 6));
        farm.getGoatStables().get(2).addAll(goats.subList(6, 9));
    }

    public Farm getFarm() {
        return farm;
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }

    public Farmer getFroilan() {
        return froilan;
    }

    public void setFroilan(Farmer froilan) {
        this.froilan = froilan;
    }

    public Pilot getFroilanda() {
        return froilanda;
    }

    public void setFroilanda(Pilot froilanda) {
        this.froilanda = froilanda;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }
}


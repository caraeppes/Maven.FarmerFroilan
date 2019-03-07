package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.FarmStructures.*;
import com.zipcodewilmington.froilansfarm.Interfaces.Person;
import com.zipcodewilmington.froilansfarm.People.BasicPerson;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import java.util.List;

public class MainApplication {


    private static Person person = new BasicPerson();
    private static Farmer froilan = new Farmer(person, new Farm());

    private static Person person2 = new BasicPerson();
    private static Pilot froilanda = new Pilot(person2);

    private static Farm farm = froilan.getFarm();
    private static Field field = farm.getField();
    private static FarmHouse farmHouse = farm.getFarmHouse();

    public static void setUp() {

        farmHouse.add(froilan);
        farmHouse.add(froilanda);

        // Makes 5 CropRows
        for (int i = 0; i < 5; i++) {
            field.add(new CropRow());
        }

        // Plant corn in CropRow1
        CropRow cropRow1 = field.getCropRows().get(0);
        froilan.plant(new CornStalk(), cropRow1);

        // Plant TomatoPlant in CropRow2
        CropRow cropRow2 = field.getCropRows().get(1);
        froilan.plant(new TomatoPlant(), cropRow2);

        // Plant arbitrary vegetation if CropRow3 to CropRow5
        CropRow cropRow3 = field.getCropRows().get(2);
        froilan.plant(new CornStalk(), cropRow3);

        CropRow cropRow4 = field.getCropRows().get(3);
        froilan.plant(new TomatoPlant(), cropRow4);

        CropRow cropRow5 = field.getCropRows().get(4);
        froilan.plant(new TomatoPlant(), cropRow5);


        // Adds 4 ChickenCoops to the Farm
        for (int i = 0; i < 4; i++) {
            farm.getChickenCoops().add(new ChickenCoop());
        }

        ChickenCoop chickenCoop1 = farm.getChickenCoops().get(0);
        ChickenCoop chickenCoop2 = farm.getChickenCoops().get(1);
        ChickenCoop chickenCoop3 = farm.getChickenCoops().get(2);
        ChickenCoop chickenCoop4 = farm.getChickenCoops().get(3);

        List<Chicken> chickens = Chicken.makeChickens(15);
        chickenCoop1.addAll(chickens.subList(0, 3));
        chickenCoop2.addAll(chickens.subList(3, 7));
        chickenCoop3.addAll(chickens.subList(7, 11));
        chickenCoop4.addAll(chickens.subList(11, 15));

        for(int i = 0; i < 3; i++){
            farm.getStables().add(new Stable());
        }

        Stable stable1 = farm.getStables().get(0);
        Stable stable2 = farm.getStables().get(1);
        Stable stable3 = farm.getStables().get(2);

        List<Horse> horses = Horse.makeHorses(10);
        stable1.addAll(horses.subList(0, 3));
        stable2.addAll(horses.subList(3, 6));
        stable3.addAll(horses.subList(6, 10));

        Tractor tractor = new Tractor();
        CropDuster cropDuster = new CropDuster();

        farm.getFarmVehicles().add(tractor);
        farm.getFarmVehicles().add(cropDuster);

        froilanda.setAircraft(cropDuster);

    }


    public static Farmer getFroilan() {
        return froilan;
    }

    public static Pilot getFroilanda(){
        return froilanda;
    }

    public static void setFroilan(Farmer froilan) {
        MainApplication.froilan = froilan;
    }

    public static void main(String[] args) {

        setUp();

        for (int i = 0; i < 4; i++) {
            System.out.println(farm.getChickenCoops().get(i).getInhabitants().size());
        }
    }

    public static Farm getFarm() {
        return farm;
    }
}
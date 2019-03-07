package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.FarmStructures.ChickenCoop;
import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.FarmStructures.Field;
import com.zipcodewilmington.froilansfarm.Interfaces.Person;
import com.zipcodewilmington.froilansfarm.People.BasicPerson;
import com.zipcodewilmington.froilansfarm.People.Farmer;

public class MainApplication {


    private static Person person = new BasicPerson();
    private static Farmer froilan = new Farmer(person, new Farm());

    private static Farm farm = froilan.getFarm();
    private static Field field = farm.getField();

    public static void setUp() {

        for (int i = 0; i < 5; i++) {
            field.add(new CropRow());
        }

        CropRow cropRow1 = field.getCropRows().get(0);
        froilan.plant(new CornStalk(), cropRow1);

        CropRow cropRow2 = field.getCropRows().get(1);
        froilan.plant(new TomatoPlant(), cropRow2);

        CropRow cropRow3 = field.getCropRows().get(2);
        froilan.plant(new CornStalk(), cropRow3);

        CropRow cropRow4 = field.getCropRows().get(3);
        froilan.plant(new TomatoPlant(), cropRow4);

        CropRow cropRow5 = field.getCropRows().get(4);
        froilan.plant(new TomatoPlant(), cropRow5);


        for(int i = 0; i < 4; i++) {
            farm.getChickenCoops().add(new ChickenCoop());
        }
    }

        public static void main (String[]args){

        setUp();

        for(int i = 0; i < 4; i++){
            System.out.println(farm.getChickenCoops().get(i).getInhabitants());
        }

        }

    }
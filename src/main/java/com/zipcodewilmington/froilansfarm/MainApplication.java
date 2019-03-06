package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.FarmStructures.Field;
import com.zipcodewilmington.froilansfarm.Interfaces.Person;
import com.zipcodewilmington.froilansfarm.People.BasicPerson;
import com.zipcodewilmington.froilansfarm.People.Farmer;

public class MainApplication {

    public void setUp() {

        Person froilan = new Farmer(new BasicPerson(), new Farm());

        Farm farm = ((Farmer) froilan).getFarm();
        Field field = farm.getField();

        for (int i = 0; i < 5; i++) {
            field.add(new CropRow());
        }

        CropRow cropRow1 = field.getCropRows().get(0);
        ((Farmer) froilan).plant(new CornStalk(), cropRow1);

        CropRow cropRow2 = field.getCropRows().get(1);
        ((Farmer) froilan).plant(new TomatoPlant(), cropRow2);

        CropRow cropRow3 = field.getCropRows().get(0);
        ((Farmer) froilan).plant(new CornStalk(), cropRow3);

        CropRow cropRow4 = field.getCropRows().get(1);
        ((Farmer) froilan).plant(new TomatoPlant(), cropRow4);

        CropRow cropRow5 = field.getCropRows().get(1);
        ((Farmer) froilan).plant(new TomatoPlant(), cropRow5);
    }




    public static void main(String[] args) {

    }

}
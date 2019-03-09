package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Cow;
import com.zipcodewilmington.froilansfarm.Animals.Goat;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Edibles.Carrot;
import com.zipcodewilmington.froilansfarm.Edibles.Milk;
import com.zipcodewilmington.froilansfarm.FarmStructures.CowBarn;
import com.zipcodewilmington.froilansfarm.FarmStructures.GoatStable;
import com.zipcodewilmington.froilansfarm.FarmStructures.Silo;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class WednesdayTest {

    @Test
    public void wednesdayCowFroilanSiloTest() {
        //Given
        int count = 0;
        Silo silo = new Silo();
        Edible edible = new Milk();

        List<Edible> ediblesList = new ArrayList<>();
        ediblesList.add(edible);
        silo.addEdibles(ediblesList);
        System.out.println("Silo Original Size " + silo.getEdibles().size());

        CowBarn cowBarn = new CowBarn();
        List<Cow> expectedNoCows = new ArrayList<>();

        List<Cow> cowsList = Cow.makeCows(3);
        cowBarn.addCows(cowsList);
        Assert.assertEquals(3,cowBarn.getInhabitants().size());


        System.out.println("No. of Expected Cows: " + expectedNoCows.size());
        //cow0.milk(cow0,silo);
        List<Edible> actual;

        for (Cow cow : cowBarn.getInhabitants()) {
            cow.milk(silo);
        }

        count = silo.getInhabitants().size();

        actual = silo.getEdibles();
        System.out.print("silo Edible Size  " + count);

       // Assert.assertEquals(expectedNoCows.size(),actual.size());


    }

    @Test
    public void wednesdayGoatFroilanSiloTest() {
        //Given
        int count = 0;
        Silo silo = new Silo();
        Edible edible = new Milk();

        List<Edible> ediblesList = new ArrayList<>();
        ediblesList.add(edible);
        silo.addEdibles(ediblesList);
        System.out.println("Silo Original Size " + silo.getEdibles().size());

        GoatStable goatStable = new GoatStable();
        List<Goat> expectedNoG = new ArrayList<>();

       List<Goat> goatList=  Goat.makeGoats(3);
        goatStable.addGoats(goatList);
       Assert.assertEquals(goatStable.getInhabitants().size(),3);

        System.out.println("No. of Expected Cows: " + expectedNoG.size());
        List<Edible> actual;

        for (Goat goat : goatStable.getInhabitants()) {
            goat.milk(silo);
        }

        count = silo.getInhabitants().size();

        actual = silo.getEdibles();
        System.out.print("silo Edible Size  " + count);

        //TODO
        // Assert.assertEquals(expectedNoG.size(),actual.size());


    }
}

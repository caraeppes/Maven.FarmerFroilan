package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Cow;
import com.zipcodewilmington.froilansfarm.Animals.Goat;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Edibles.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Edibles.Milk;
import com.zipcodewilmington.froilansfarm.FarmStructures.ChickenCoop;
import com.zipcodewilmington.froilansfarm.FarmStructures.CowBarn;
import com.zipcodewilmington.froilansfarm.FarmStructures.GoatStable;
import com.zipcodewilmington.froilansfarm.FarmStructures.Silo;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WednesdayTest {

    FroilansFarm froilansFarm;
    Farmer froilan;
    Silo silo;

    @Before
    public void setUp() {
        froilansFarm = FroilansFarm.getInstance().testFroilansFarm();
        froilan = froilansFarm.getFroilan();
        silo = froilansFarm.getFarm().getSilo();
    }

    @Test
    public void froilanMilkCowsTest() throws Exception {
        //Given
        CowBarn cowBarn = froilansFarm.getFarm().getCowBarns().get(0);
        int expected = cowBarn.getInhabitants().size();

        // When
        for (Cow cow : cowBarn.getInhabitants()) {
            froilan.collect(cow);
        }
        int actual = silo.getEdibles().size();

        // Then
        Assert.assertEquals(expected, actual);
        for (Edible e : silo.getEdibles()) {
            Assert.assertTrue(e instanceof Milk);
        }
    }

    @Test
    public void froilanMilkGoatsTest() throws Exception {
        //Given
        GoatStable goatStable = froilansFarm.getFarm().getGoatStables().get(0);
        int expected = goatStable.getInhabitants().size();

        // When
        for (Goat goat : goatStable.getInhabitants()) {
            froilan.collect(goat);
        }
        int actual = silo.getEdibles().size();

        // Then
        Assert.assertEquals(expected, actual);
        for (Edible e : silo.getEdibles()) {
            Assert.assertTrue(e instanceof Milk);
        }
    }

    @Test
    public void froilanCollectChickenEggsTest() throws Exception {
        //Given
        ChickenCoop chickenCoop = froilansFarm.getFarm().getChickenCoops().get(0);
        int expected = chickenCoop.getInhabitants().size();

        // When
        for (Chicken chicken : chickenCoop.getInhabitants()) {
            froilan.collect(chicken);
        }
        int actual = silo.getEdibles().size();

        // Then
        Assert.assertEquals(expected, actual);
        for (Edible e : silo.getEdibles()) {
            Assert.assertTrue(e instanceof EdibleEgg);
        }
    }


    @Test (expected = Exception.class)
    public void collectFromHorseTest() throws Exception{
        // Given
        Horse horse = froilansFarm.getFarm().getStables().get(0).getInhabitants().get(0);

        // When
        froilan.collect(horse);
    }

    @Test (expected = Exception.class)
    public void collectFromFertilizedChickenTest() throws Exception{
        // Given
        Chicken chicken = froilansFarm.getFarm().getChickenCoops().get(0).getInhabitants().get(0);
        chicken.setHasBeenFertilized(true);

        // When
        froilan.collect(chicken);
    }




}

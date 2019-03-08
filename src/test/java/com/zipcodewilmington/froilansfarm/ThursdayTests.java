package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Cow;
import com.zipcodewilmington.froilansfarm.Animals.Goat;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.FarmStructures.*;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ThursdayTests {


    @Test
    public void froilanMakeNoiseTest(){
        // Given
        FroilansFarm froilansFarm = FroilansFarm.getInstance().testFroilansFarm();
        Farmer froilan = froilansFarm.getFroilan();

        String expected = "Howdy! I'm a Farmer!";

        // When
        String actual = froilan.makeNoise();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void froilandaMakeNoiseTest(){
        // Given
        FroilansFarm froilansFarm = FroilansFarm.getInstance().testFroilansFarm();
        Pilot froilanda = froilansFarm.getFroilanda();
        String expected = "Hi!  I'm a pilot!";

        // When
        String actual = froilanda.makeNoise();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void talkToGoatTest(){
        // Given
        FroilansFarm froilansFarm = FroilansFarm.getInstance().testFroilansFarm();
        Farm farm = froilansFarm.getFarm();
        String expected = "Meeehhhh!";

        // When
        for(GoatStable goatStable : farm.getGoatStables()){
            for(Goat goat : goatStable.getInhabitants()){
                String actual = goat.makeNoise();
                // Then
                Assert.assertEquals(expected, actual);

            }
        }
    }

    @Test
    public void talkToHorseTest(){
        // Given
        FroilansFarm froilansFarm = FroilansFarm.getInstance().testFroilansFarm();
        Farm farm = froilansFarm.getFarm();
        String expected = "Neigh!";

        // When
        for(Stable stable : farm.getStables()){
            for(Horse horse :stable.getInhabitants()){
                String actual = horse.makeNoise();
                // Then
                Assert.assertEquals(expected, actual);
            }
        }
    }

    @Test
    public void talkToCowTest(){
        // Given
        FroilansFarm froilansFarm = FroilansFarm.getInstance().testFroilansFarm();
        Farm farm = froilansFarm.getFarm();
        String expected = "Moooooo!";

        // When
        for(CowBarn cowBarn : farm.getCowBarns()){
            for(Cow cow : cowBarn.getInhabitants()){
                String actual = cow.makeNoise();
                // Then
                Assert.assertEquals(expected, actual);
            }
        }
    }


    @Test
    public void talkToChickenTest(){
        // Given
        FroilansFarm froilansFarm = FroilansFarm.getInstance().testFroilansFarm();
        Farm farm = froilansFarm.getFarm();
        String expected = "Cluck-cluck-cluck!";

        // When
        for(ChickenCoop chickenCoop : farm.getChickenCoops()){
            for(Chicken chicken : chickenCoop.getInhabitants()){
                String actual = chicken.makeNoise();
                // Then
                Assert.assertEquals(expected, actual);
            }
        }
    }
}

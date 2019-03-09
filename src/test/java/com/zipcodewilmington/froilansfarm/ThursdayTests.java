package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.*;
import com.zipcodewilmington.froilansfarm.Edibles.Milk;
import com.zipcodewilmington.froilansfarm.FarmStructures.*;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import org.junit.Assert;
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

    @Test
    public void froilanBasicPersonMakeNoiseTest(){
        // Given
        FroilansFarm froilansFarm = FroilansFarm.getInstance().testFroilansFarm();
        String expected = "I'm a person.";

        // When
        String actual = froilansFarm.getFroilan().decoratedPerson.makeNoise();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void froilandaBasicPersonMakeNoiseTest(){
        // Given
        FroilansFarm froilansFarm = FroilansFarm.getInstance().testFroilansFarm();
        String expected = "I'm a person.";

        // When
        String actual = froilansFarm.getFroilanda().decoratedPerson.makeNoise();

        // Then
        Assert.assertEquals(expected, actual);
    }
}

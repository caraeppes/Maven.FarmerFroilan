package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class EverydayTests {

    Farm froilansFarm;
    Farmer froilan;
    Pilot froilanda;

    @Before
    public void setUp() {
        MainApplication mainApplication = new MainApplication();
        mainApplication.setUpFroilansFarm();
        froilansFarm = mainApplication.getFroilansFarm();
        froilan = mainApplication.getFroilan();
        froilanda = mainApplication.getFroilanda();
    }

    @Test
    public void rideHorsesTest() {
        // Given
        List<Horse> expectedHorses = froilansFarm.getAllHorses();

        for (Horse horse : expectedHorses) {
            horse.setTimesRidden(horse.getTimesRidden() + 2);
        }

        // When
        froilan.rideAllHorses();
        froilanda.rideAllHorses();
        List<Horse> actualHorses = froilansFarm.getAllHorses();

        // Then
        Assert.assertEquals(expectedHorses, actualHorses);
    }


    @Test
    public void feedHorsesTest() {
        // Given
        List<Horse> expectedHorses = froilansFarm.getAllHorses();

        for (Horse horse : expectedHorses) {
            horse.eat(new EarCorn());
            horse.eat(new EarCorn());
            horse.eat(new EarCorn());
            horse.eat(new EarCorn());
            horse.eat(new EarCorn());
            horse.eat(new EarCorn());
        }

        // When
        froilan.feedAllHorses(3);
        froilanda.feedAllHorses(3);

        List<Horse> actualHorses = froilansFarm.getAllHorses();

        // Then
        Assert.assertEquals(expectedHorses, actualHorses);
    }


    @Test
    public void eatFroilansBreakfastTest(){
        // Given
        List<Edible> expected = new ArrayList<>();
        expected.add(new EarCorn());
        expected.add(new Tomato());
        expected.add(new Tomato());
        for(int i = 0; i < 5; i++){
            expected.add(new EdibleEgg());
        }

        // When
        froilan.eatFroilansBreakfast();
        List<Edible> actual = froilan.getEdiblesEaten();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatFroilandasBreakfastTest(){
        // Given
        List<Edible> expected = new ArrayList<>();
        expected.add(new EarCorn());
        expected.add(new EarCorn());
        expected.add(new Tomato());
        expected.add(new EdibleEgg());
        expected.add(new EdibleEgg());

        // When
        froilanda.eatFroilandasBreakfast();
        List<Edible> actual = froilanda.getEdiblesEaten();

        // Then
        Assert.assertEquals(expected, actual);
    }
}

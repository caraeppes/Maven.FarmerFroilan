package com.zipcodewilmington.froilansfarm;


import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.FarmStructures.Stable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class DailyTests {

    Farm farm;
    Pilot froilanda;
    Farmer froilan;

    @Before
    public void setUp() {
        MainApplication.setUp();
        farm = MainApplication.getFarm();
        froilanda = (Pilot) farm.getFarmHouse().getInhabitants().get(1);
        froilan = MainApplication.getFroilan();
    }

    @After
    public void tearDown(){
        for(Stable stable : farm.getStables()){
            for(Horse horse : stable.getInhabitants()){
                horse.getFoodEaten().clear();
                horse.setMounted(false);
            }
        }
    }

    @Test
    public void froilanRideHorsesTest() {
        // When
        for (Stable stable : froilan.getFarm().getStables()) {
            for (Object horse : stable.getInhabitants()) {
                froilan.mount((Rideable) horse);
                // Then
                Assert.assertTrue(((Rideable) horse).isMounted());
            }
        }
    }


    @Test
    public void froilandaRideHorsesTest() {
        // When
        for (Stable stable : farm.getStables()) {
            for (Object horse : stable.getInhabitants()) {
                froilanda.mount((Rideable) horse);
                // Then
                Assert.assertTrue(((Rideable) horse).isMounted());
            }
        }
    }


    @Test
    public void horseEatingCornTest() {
        // Given
        Horse horse = (Horse) farm.getStables().get(0).getInhabitants().get(0);
        int expected = 3;

        // When
        for (int i = 0; i < 3; i++) {
            horse.eat(new EarCorn());
        }
        int actual = horse.getFoodEaten().size();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void froilanFeedHorsesTest() {
        // Given
        Horse horse = (Horse) farm.getStables().get(0).getInhabitants().get(0);
        int expected = 3;

        // When
        for (int i = 0; i < 3; i++) {
            froilan.feed(horse, new EarCorn());
        }
        int actual = horse.getFoodEaten().size();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void froilandaFeedHorsesTest() {
        // Given
        Horse horse = (Horse) farm.getStables().get(0).getInhabitants().get(0);
        int expected = 3;

        // When
        for (int i = 0; i < 3; i++) {
            froilanda.feed(horse, new EarCorn());
        }
        int actual = horse.getFoodEaten().size();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void froilanEatBreakfastTest(){
        // Given
        EarCorn expectedEarCorn = new EarCorn();
        Tomato expectedTomato = new Tomato();
        EdibleEgg expectedEdibleEgg = new EdibleEgg();

        // When
        froilan.eat(expectedEarCorn);
        froilan.eat(expectedTomato);
        froilan.eat(expectedTomato);
        for(int i  = 0; i < 5; i++){
            froilan.eat(expectedEdibleEgg);
        }

        // Then
        Assert.assertEquals(expectedEarCorn, froilan.getFoodEaten().get(0));
        Assert.assertEquals(expectedTomato, froilan.getFoodEaten().get(1));
        Assert.assertEquals(expectedTomato, froilan.getFoodEaten().get(2));
        for(int i = 3; i < 8; i++){
            Assert.assertEquals(expectedEdibleEgg, froilan.getFoodEaten().get(i));
        }
    }

    @Test
    public void froilandaEatBreakfastTest(){
        // Given
        EarCorn expectedEarCorn = new EarCorn();
        Tomato expectedTomato = new Tomato();
        EdibleEgg expectedEdibleEgg = new EdibleEgg();

        // When
        froilanda.eat(expectedEarCorn);
        froilanda.eat(expectedEarCorn);
        froilanda.eat(expectedTomato);
        for(int i  = 0; i < 2; i++){
            froilanda.eat(expectedEdibleEgg);
        }

        // Then
        Assert.assertEquals(expectedEarCorn, froilanda.getFoodEaten().get(0));
        Assert.assertEquals(expectedEarCorn, froilanda.getFoodEaten().get(1));
        Assert.assertEquals(expectedTomato, froilanda.getFoodEaten().get(2));
        for(int i = 3; i < 5; i++){
            Assert.assertEquals(expectedEdibleEgg, froilanda.getFoodEaten().get(i));
        }
    }

}

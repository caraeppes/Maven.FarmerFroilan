package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.FarmStructures.Field;
import com.zipcodewilmington.froilansfarm.FarmStructures.Silo;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TuesdayTests {


    Farm farm;
    Pilot froilanda;
    Farmer froilan;
    Tractor tractor;
    Silo silo;
    Field field;

    @Before
    public void setUp() {

        MainApplication.setUp();
        farm = MainApplication.getFarm();
        froilanda = (Pilot) farm.getFarmHouse().getInhabitants().get(1);
        froilan = MainApplication.getFroilan();
        tractor = (Tractor) farm.getFarmVehicles().get(0);
        field = farm.getField();
        silo = farm.getSilo();

    }

    @After
    public void tearDown(){
        for(CropRow cropRow : field.getCropRows()){
            cropRow.getCrops().clear();
        }

        silo.getEdibles().clear();
    }



   @Test
    public void harvestCropsThatHaveBeenFertilizedTest(){
        // Given
        for (CropRow cropRow : field.getCropRows()){
            for(Crop crop : cropRow.getCrops()){
                crop.setHasBeenFertilized(true);
                crop.setHasBeenHarvested(false);
            }
        }

        // When
        for(CropRow cropRow : field.getCropRows()){
            for(Crop crop : cropRow.getCrops()){
                tractor.harvest(crop, silo);
            }
        }

        // Then
        for(CropRow cropRow : field.getCropRows()){
            for(Crop crop : cropRow.getCrops()){
                Assert.assertTrue(crop.isHasBeenHarvested());
            }
        }
    }

    @Test
    public void harvestCropsThatHaveNotBeenFertilized(){
        // Given
        Field field = farm.getField();
        for (CropRow cropRow : field.getCropRows()){
            for(Crop crop : cropRow.getCrops()){
                crop.setHasBeenFertilized(false);
                crop.setHasBeenHarvested(false);
            }
        }

        // When
        for(CropRow cropRow : field.getCropRows()){
            for(Crop crop : cropRow.getCrops()){
                tractor.harvest(crop, silo);
            }
        }

        // Then
        for(CropRow cropRow : field.getCropRows()){
            for(Crop crop : cropRow.getCrops()){
                Assert.assertFalse(crop.isHasBeenHarvested());
            }
        }
    }

    @Test
    public void harvestCropsSiloTest() {
        // Given
        for (CropRow cropRow : field.getCropRows()) {
            for (Crop crop : cropRow.getCrops()) {
                crop.setHasBeenFertilized(true);
                crop.setHasBeenHarvested(false);
            }
        }

        List<Edible> expected = new ArrayList<>();
        expected.add(new EarCorn());
        expected.add(new Tomato());
        expected.add(new EarCorn());
        expected.add(new Tomato());
        expected.add(new Tomato());

        List<Edible> actual;

        // When
        for (CropRow cropRow : field.getCropRows()) {
            for (Crop crop : cropRow.getCrops()) {
                tractor.harvest(crop, silo);
            }
        }
        actual = silo.getEdibles();

        // Then
        for (int i = 0; i < expected.size(); i++) {
            Assert.assertEquals(expected.get(i).getClass(), actual.get(i).getClass());
        }
    }
}

package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.Edibles.Carrot;
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

public class TuesdayTests {


   @Test
    public void harvestCropsThatHaveBeenFertilizedTest(){
       FroilansFarm froilansFarm = FroilansFarm.getInstance().testFroilansFarm();
       Field field = froilansFarm.getField();
       Tractor tractor = (Tractor) froilansFarm.getFarm().getFarmVehicles().get(0);
       Silo silo = froilansFarm.getFarm().getSilo();
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
        FroilansFarm froilansFarm = FroilansFarm.getInstance().testFroilansFarm();
        Field field = froilansFarm.getField();
        Tractor tractor = (Tractor) froilansFarm.getFarm().getFarmVehicles().get(0);
        Silo silo = froilansFarm.getFarm().getSilo();

        // Given
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
    public void harvestCropsThatHaveAlreadyBeenHarvestedTest() {
        FroilansFarm froilansFarm = FroilansFarm.getInstance().testFroilansFarm();
        Field field = froilansFarm.getField();
        Tractor tractor = (Tractor) froilansFarm.getFarm().getFarmVehicles().get(0);
        Silo silo = froilansFarm.getFarm().getSilo();

        // Given
        for (CropRow cropRow : field.getCropRows()) {
            for (Crop crop : cropRow.getCrops()) {
                crop.setHasBeenFertilized(true);
                crop.setHasBeenHarvested(true);
            }
        }
        int expected = 0;

        // When
        for (CropRow cropRow : field.getCropRows()) {
            for (Crop crop : cropRow.getCrops()) {
                tractor.harvest(crop, silo);
            }
        }
        int actual = silo.getEdibles().size();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void harvestCropsSiloTest() {
        FroilansFarm froilansFarm = FroilansFarm.getInstance().testFroilansFarm();
        Field field = froilansFarm.getField();
        Tractor tractor = (Tractor) froilansFarm.getFarm().getFarmVehicles().get(0);
        Silo silo = froilansFarm.getFarm().getSilo();

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
        expected.add(new Carrot());
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

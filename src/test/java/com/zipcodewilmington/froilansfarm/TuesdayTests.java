package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.FarmStructures.Field;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TuesdayTests {

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
    public void mountTractorTest() {
        // Given
        Tractor tractor = (Tractor) froilansFarm.getFarmVehicles().get(0);

        // When
        froilan.mount(tractor);
        boolean actual = tractor.isMounted();

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void harvestCropsTest() {
        // Given
        Tractor tractor = (Tractor) froilansFarm.getFarmVehicles().get(0);
        List<Edible> expected  = new ArrayList<>();

        for(CropRow cropRow : froilansFarm.getField().getCropRows()){
            for(Crop crop : cropRow.getCrops()){
                crop.setHasBeenHarvested(true);
                expected.add(crop.yield());
            }
        }

        // When
        for(CropRow cropRow : froilansFarm.getField().getCropRows()){
            for(Crop crop :cropRow.getCrops()){
                tractor.harvest(crop);
            }
        }
        List<Edible> actual = froilansFarm.getHarvestedCrops();

        // Then
        Assert.assertEquals(expected, actual);
    }
}

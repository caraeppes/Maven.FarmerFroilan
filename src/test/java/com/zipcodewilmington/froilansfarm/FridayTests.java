package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.FarmStructures.Field;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.FarmVehicle;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FridayTests {

    Farm farm;
    Farmer froilan;

    @Before
    public void setUp() {
       FroilansFarm froilansFarm = FroilansFarm.getInstance().testFroilansFarm();
       farm = froilansFarm.getFarm();
       froilan = froilansFarm.getFroilan();
    }

    @Test
    public void clearOneCropRow(){
        // Given
        CropRow cropRow = farm.getField().getCropRows().get(0);
        froilan.plant(new CornStalk(), cropRow);
        froilan.plant(new TomatoPlant(), cropRow);
        int expectedSize = 0;

        // When
        cropRow.clearCrops();
        int actualSize = cropRow.getCrops().size();

        // Then
        Assert.assertEquals(expectedSize, actualSize);
    }


    @Test
    public void cleanFieldTest(){
        // Given
        Field field = farm.getField();
        for(CropRow cropRow : field.getCropRows()){
            froilan.plant(new CarrotPlant(), cropRow);
            froilan.plant(new TomatoPlant(), cropRow);
            froilan.plant(new CornStalk(), cropRow);
        }
        int expectedSize = 0;

        // When
        froilan.cleanField();

        // Then
        for(CropRow cropRow : field.getCropRows()){
            int actualSize = cropRow.getCrops().size();
            Assert.assertEquals(expectedSize, actualSize);
        }
    }
}





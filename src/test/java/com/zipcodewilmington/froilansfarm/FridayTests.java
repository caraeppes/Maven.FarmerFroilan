package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
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
    Pilot froilanda;
    Farmer froilan;
    CropDuster cropduster;
    CropRow croprow;

    @Before
    public void setUp() {
        MainApplication main = new MainApplication();
        farm = main.getFroilansFarm().getFarm();
        froilanda = main.getFroilansFarm().getFroilanda();
        froilan = main.getFroilansFarm().getFroilan();
        cropduster = new CropDuster();
        croprow = new CropRow();

    }

    @After
    public void tearDown() {
        for (CropRow cropRow : farm.getField().getCropRows()) {
            cropRow.getCrops().clear();
        }

        farm.getSilo().getEdibles().clear();
    }


    @Test
    public void pickCropsfromCroprowTest() {

        // Given
        List<Crop> crops = new ArrayList<>();
        crops.add(new TomatoPlant());
        crops.add(new CarrotPlant());
        crops.add(new CornStalk());

        // for (CropRow cropRow : farm.getField().getCropRows()) {

        croprow.setCrops(crops);


        //When
        croprow.removeCrops(crops.get(0));
        croprow.removeCrops(crops.get(1));
        //Then
        int expected = 1;
        int actual = crops.size();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void clearAllCropsFromCroprowTest() {


        // Given
        List<Crop> crops = new ArrayList<>();
        crops.add(new TomatoPlant());
        crops.add(new CarrotPlant());
        crops.add(new CornStalk());

        for (CropRow cropRow : farm.getField().getCropRows()) {

            croprow.setCrops(crops);


            //When
            croprow.removeCroprow(crops);
            //Then
            int expected = 0;
            int actual = crops.size();

            Assert.assertEquals(expected, actual);
        }
    }


        @Test
        public void removeCroprowFromFieldTest () {


            // Given
            List<CropRow> croprow = new ArrayList<>();

            for (int i = 0; i < 5; i++) {
                croprow.add(new CropRow());
            }

            farm.getField().setCropRows(croprow);
            //When
            farm.getField().remove(croprow.get(0));
            farm.getField().remove(croprow.get(1));
            //Then
            int expected = 3;
            int actual = farm.getField().getCropRows().size();

            Assert.assertEquals(expected, actual);
        }

    @Test
    public void cleanFieldTest () {


        // Given
        List<CropRow> croprow = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            croprow.add(new CropRow());
        }

        farm.getField().setCropRows(croprow);
        //When
        farm.getField().cleanField();

        //Then
       int expected =croprow.size();
       int actual = 0;

        Assert.assertEquals(expected, actual);
        Assert.assertTrue(croprow.isEmpty());
    }




}





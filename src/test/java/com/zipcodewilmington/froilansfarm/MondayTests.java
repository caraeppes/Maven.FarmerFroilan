package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;

import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.FarmStructures.Stable;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicles.FarmVehicle;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class MondayTests {

    Farm farm;
    Pilot froilanda;
    Farmer froilan;
    FarmVehicle farmvehicle;
    CropDuster cropduster;
    CropRow croprow;

    @Before
    public void setUp() {
        MainApplication.setUp();
        farm = MainApplication.getFarm();
        froilanda = (Pilot) farm.getFarmHouse().getInhabitants().get(1);
        froilan = MainApplication.getFroilan();
        cropduster = new CropDuster();
        croprow = new CropRow();

    }

    @After
    public void tearDown(){
        for(CropRow cropRow : farm.getField().getCropRows()){
            cropRow.getCrops().clear();
        }

        farm.getSilo().getEdibles().clear();
    }


    @Test
    public void froilandaflycropdusterTest() {


        // Given

        froilanda.setAircraft(cropduster);
        // When

        froilanda.mount((Rideable) froilanda.getAircraft());
        //Then

        Assert.assertTrue(((Rideable) froilanda.getAircraft()).isMounted());
    }

    @Test
    public void froilandafirtilizefieldrTest() {
        // Given
        froilanda.setAircraft(cropduster);

        froilanda.mount((Rideable) froilanda.getAircraft());

        cropduster.fertilize(croprow);
        int expected = 4;

        // When
        for (int i = 0; i < 3; i++) {
            cropduster.fertilize(croprow);
        }
        int actual = cropduster.getCroprowlist().size();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void FieldhasbeenfertilizedTest() {


        // Given

        froilanda.setAircraft(cropduster);
        froilanda.mount((Rideable) froilanda.getAircraft());

        cropduster.fertilize(croprow);
        Boolean expected = true;

        // When
        for (int i = 0; i < 3; i++) {
            cropduster.fertilize(croprow);
        }
        //Then
        Assert.assertEquals(expected, croprow.isHasBeenFertilized());
    }


}

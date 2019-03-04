package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SundayTests {

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
    public void plantCornStalkTest(){
        // Given
        CropRow cropRow1 = froilansFarm.getField().getCropRow(0);
        Crop expected = new CornStalk(false, false);

        // When
        froilan.plant(new CornStalk(false, false), cropRow1);
        Crop actual = cropRow1.getCrop(cropRow1.getCrops().size() - 1);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void plantTomatoPlantsTest(){
        // Given
        CropRow cropRow2 = froilansFarm.getField().getCropRow(1);
        Crop expected = new TomatoPlant(false, false);

        // When
        froilan.plant(new TomatoPlant(false, false), cropRow2);
        Crop actual = cropRow2.getCrop(cropRow2.getCrops().size() - 1);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void plantStrawberryPlantsTest(){
        // Given
        CropRow cropRow3 = froilansFarm.getField().getCropRow(2);
        Crop expected = new StrawberryPlant(false, false);

        // When
        froilan.plant(new StrawberryPlant(false, false), cropRow3);
        Crop actual = cropRow3.getCrop(cropRow3.getCrops().size() - 1);

        // Then
        Assert.assertEquals(expected, actual);
    }
}

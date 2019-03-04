package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.FarmStructures.Field;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MondayTests {

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
    public void mountCropDusterTest(){
        // Given
        CropDuster cropDuster = (CropDuster)froilanda.getAircraft();

        // When
        froilanda.mount(cropDuster);
        boolean actual = cropDuster.isMounted();

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void flyCropDusterTest(){
        // Given
        CropDuster cropDuster = (CropDuster)froilanda.getAircraft();

        // When
        cropDuster.fly();
        boolean actual = cropDuster.isFlying();
    }

    @Test
    public void fertilizeCropRowsTest(){
        // Given
        CropDuster cropDuster = (CropDuster)froilanda.getAircraft();
        Field expected = froilansFarm.getField();

        for(CropRow cropRow : expected.getCropRows()){
            for(Crop crop : cropRow.getCrops()){
                crop.setHasBeenFertilized(true);
            }
        }

        // When
        cropDuster.fly();
        Field actual = froilansFarm.getField();
        for(CropRow cropRow : actual.getCropRows()){
            cropDuster.fertilize(cropRow);
        }

        // Then
        Assert.assertEquals(expected, actual);
    }


}

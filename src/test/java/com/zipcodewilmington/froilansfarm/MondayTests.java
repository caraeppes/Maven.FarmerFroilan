package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class MondayTests {

    Farm farm;
    Pilot froilanda;
    Farmer froilan;
    CropDuster cropDuster;

    @Before
    public void setUp() {
        FroilansFarm froilansFarm = FroilansFarm.getInstance().testFroilansFarm();
        farm = froilansFarm.getFarm();
        froilanda = froilansFarm.getFroilanda();
        froilan = froilansFarm.getFroilan();
        cropDuster = (CropDuster) farm.getFarmVehicles().get(1);
    }


    @Test
    public void froilandaGetAircraftTest() {
        // Given
        CropDuster expected = cropDuster;

        // When
        CropDuster actual = (CropDuster) froilanda.getAircraft();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void froilandaMountCropdusterTest() {
        // Given
        cropDuster.setMounted(false);

        // When
        froilanda.mount(cropDuster);

        // Then
        Assert.assertTrue(cropDuster.isMounted());
    }


    @Test
    public void froilandaFlyCropdusterTest() {
        // Given
        cropDuster.setFlying(false);
        froilanda.mount(cropDuster);

        // When
        cropDuster.fly();

        // Then
        Assert.assertTrue(cropDuster.isFlying());
    }


    @Test
    public void froilandaFlyCropdusterNotMountedTest() {
        // Given
        cropDuster.setFlying(false);
        froilanda.dismount(cropDuster);

        // When
        cropDuster.fly();

        // Then
        Assert.assertFalse(cropDuster.isFlying());
    }


    @Test
    public void operateCropDusterTest() {
        // Given
        for (CropRow cropRow : farm.getField().getCropRows()) {
            cropRow.setHasBeenFertilized(false);
        }
        froilanda.mount(cropDuster);
        cropDuster.fly();

        // When
        cropDuster.operate(farm);

        // Then
        for (CropRow cropRow : farm.getField().getCropRows()) {
            Assert.assertTrue(cropRow.hasBeenFertilized());
            for (Crop crop : cropRow.getCrops()) {
                Assert.assertTrue(crop.hasBeenFertilized());
            }
        }
    }

    @Test
    public void operateNotFlyingTest() {
        // Given
        for (CropRow cropRow : farm.getField().getCropRows()) {
            cropRow.setHasBeenFertilized(false);
        }
        froilanda.mount(cropDuster);
        cropDuster.setFlying(false);

        // When
        cropDuster.operate(farm);

        // Then
        for (CropRow cropRow : farm.getField().getCropRows()) {
            Assert.assertFalse(cropRow.hasBeenFertilized());
            for (Crop crop : cropRow.getCrops()) {
                Assert.assertFalse(crop.hasBeenFertilized());
            }
        }
    }



    @Test
    public void froilandaDismountCropdusterTest() {
        // Given
        froilanda.mount(cropDuster);

        // When
        froilanda.dismount(cropDuster);

        // Then
        Assert.assertFalse(cropDuster.isMounted());
    }


    @Test
    public void cropDusterMakeNoiseTest() {
        // Given
        String expected = "grrr";

        // When
        String actual = cropDuster.makeNoise();

        // Then
        Assert.assertEquals(expected, actual);
    }
}

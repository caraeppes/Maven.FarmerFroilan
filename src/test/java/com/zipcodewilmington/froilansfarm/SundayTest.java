package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.CarrotPlant;
import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SundayTest {


    @Test
    public void sundayFroilanCropTest() {
        // Given
        FroilansFarm froilansFarm = FroilansFarm.getInstance().testFroilansFarm();
        Farm farm = froilansFarm.getFarm();
        Farmer froilan = froilansFarm.getFroilan();


        CornStalk expectedCornPlant = new CornStalk();
        TomatoPlant expectedTomatoePlant = new TomatoPlant();
        CarrotPlant expectedCarrotPlant = new CarrotPlant();
        CropRow cropRow = farm.getField().getCropRows().get(0);

        // When

        froilan.plant(expectedCornPlant,cropRow);
        froilan.plant(expectedTomatoePlant, cropRow);
        froilan.plant(expectedCarrotPlant,cropRow);

        CornStalk cornActual = (CornStalk) froilan.getFarm().getField().getCropRows().get(0).getCrops().get(1);
        TomatoPlant tomatoActual = (TomatoPlant) froilan.getFarm().getField().getCropRows().get(0).getCrops().get(2);
        CarrotPlant carrotActual =(CarrotPlant) froilan.getFarm().getField().getCropRows().get(0).getCrops().get(3);

        // Then

        Assert.assertEquals(expectedTomatoePlant, tomatoActual);
        Assert.assertEquals(expectedCornPlant, cornActual);
        Assert.assertEquals(expectedCarrotPlant, carrotActual);
    }

}

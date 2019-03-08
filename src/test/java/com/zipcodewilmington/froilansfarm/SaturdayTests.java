package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Edibles.Carrot;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.FarmStructures.FarmStand;
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

public class SaturdayTests {


    Farm farm;
    Pilot froilanda;
    Farmer froilan;
    Tractor tractor;
    Silo silo;
    Field field;
    FarmStand farmStand;
    List<Edible> ediblesSold ;
    List<Edible> basket ;

    @Before
    public void setUp() {

        farmStand= new FarmStand();

        ediblesSold = new ArrayList<>();
        basket= new ArrayList<>();
    }


    @Test
    public void sellSaturdayMarketTest() {
        ediblesSold = new ArrayList<>();
        basket= new ArrayList<>();

        for (int i=0;i<4;i++) {
            basket.add(new Tomato());
            basket.add(new EarCorn());
            basket.add(new EdibleEgg());
            basket.add(new Carrot());

        }

        ediblesSold.add(basket.get(0));
        ediblesSold.add(basket.get(1));
        ediblesSold.add(basket.get(3));
        ediblesSold.add(basket.get(4));


        double expectedMoneyJar=4;
        int expectedBasketSize = 12;

        farmStand.sell(ediblesSold,basket);

        int actualBasketSize = basket.size();
        int actualediSize = ediblesSold.size();

        double actualMoneyJar = farmStand.moneyJar;




        Assert.assertEquals(expectedBasketSize,actualBasketSize);
        Assert.assertEquals(expectedMoneyJar,actualMoneyJar,0);


    }
}

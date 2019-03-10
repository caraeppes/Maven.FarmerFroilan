package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Edibles.*;
import com.zipcodewilmington.froilansfarm.FarmStructures.FarmStand;
import com.zipcodewilmington.froilansfarm.FarmStructures.Silo;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SaturdayTests {

    Farmer froilan;
    Silo silo;
    FarmStand farmStand;
    List<Edible> basket ;
    FroilansFarm froilansFarm;

    @Before
    public void setUp() {
        froilansFarm = FroilansFarm.getInstance().testFroilansFarm();
        froilan = froilansFarm.getFroilan();
        silo = froilansFarm.getFarm().getSilo();
        farmStand = froilansFarm.getFarm().getFarmStand();
    }

    @Test
    public void sellAtFarmStandTest(){
        // Given
        Carrot carrot = new Carrot();
        Milk milk = new Milk();
        EdibleEgg egg = new EdibleEgg();

        silo.add(carrot);
        silo.add(milk);
        silo.add(egg);

        List<Edible> expectedInSilo = new ArrayList<>();
        expectedInSilo.add(carrot);
        expectedInSilo.add(egg);

        List<Edible> expectedAtFarmStand = new ArrayList<>();
        expectedAtFarmStand.add(milk);

        // When
        froilan.sellAtFarmStand(milk);
        List<Edible> actualInSilo = silo.getInhabitants();
        List<Edible> actualAtFarmStand = farmStand.getBasket();

        // Then
        Assert.assertEquals(expectedInSilo, actualInSilo);
        Assert.assertEquals(expectedAtFarmStand, actualAtFarmStand);
    }

    @Test
    public void sellSaturdayMarketTest() {
        List<Edible> ediblesSold = new ArrayList<>();
        basket = farmStand.getBasket();

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


        double expectedMoneyJar = 4;
        int expectedBasketSize = 12;

        farmStand.sell(ediblesSold, basket);

        int actualBasketSize = basket.size();

        double actualMoneyJar = farmStand.getMoneyJar();

        Assert.assertEquals(expectedBasketSize,actualBasketSize);
        Assert.assertEquals(expectedMoneyJar, actualMoneyJar,0);
    }
}

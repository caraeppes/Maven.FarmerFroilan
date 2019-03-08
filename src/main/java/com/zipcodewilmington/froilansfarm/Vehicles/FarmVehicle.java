package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.Vehicle;

import java.util.List;

public abstract class FarmVehicle implements Vehicle {

    public abstract void operate(Farm farm);


}

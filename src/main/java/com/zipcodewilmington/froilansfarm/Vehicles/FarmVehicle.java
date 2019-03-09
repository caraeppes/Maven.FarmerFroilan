package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.Vehicle;

public abstract class FarmVehicle implements Vehicle {

    private boolean isMounted;

    public FarmVehicle(){
        isMounted = false;
    }
    public abstract void operate(Farm farm);

    @Override
    public boolean isMounted() {
        return isMounted;
    }

    @Override
    public void setMounted(boolean mounted) {
        isMounted = mounted;
    }
}

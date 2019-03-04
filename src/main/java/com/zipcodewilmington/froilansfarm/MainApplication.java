package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.StrawberryPlant;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.FarmStructures.ChickenCoop;
import com.zipcodewilmington.froilansfarm.FarmStructures.Farm;
import com.zipcodewilmington.froilansfarm.FarmStructures.Field;
import com.zipcodewilmington.froilansfarm.FarmStructures.Stable;
import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

import java.util.List;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplication {

    Farm froilansFarm = new Farm();
    Farmer froilan = new Farmer(froilansFarm);
    Field froilansField = froilansFarm.getField();


    public void setUpFroilansFarm() {
        CropRow cropRow1 = new CropRow();
        CropRow cropRow2 = new CropRow();
        CropRow cropRow3 = new CropRow();
        CropRow cropRow4 = new CropRow();
        CropRow cropRow5 = new CropRow();

        cropRow1.addCrop(new CornStalk(false, false));
        cropRow2.addCrop(new TomatoPlant(false, false));
        cropRow3.addCrop(new StrawberryPlant(false, false));
        cropRow4.addCrop(new TomatoPlant(false, false));
        cropRow5.addCrop(new CornStalk(false, false));

        froilansField.addCropRow(cropRow1);
        froilansField.addCropRow(cropRow2);
        froilansField.addCropRow(cropRow3);
        froilansField.addCropRow(cropRow4);
        froilansField.addCropRow(cropRow5);

        List<ChickenCoop> froilansChickenCoops = froilansFarm.getChickenCoops();
        ChickenCoop chickenCoop1 = new ChickenCoop(5);
        ChickenCoop chickenCoop2 = new ChickenCoop(3);
        ChickenCoop chickenCoop3 = new ChickenCoop(1);
        ChickenCoop chickenCoop4 = new ChickenCoop(6);

        froilansChickenCoops.add(chickenCoop1);
        froilansChickenCoops.add(chickenCoop2);
        froilansChickenCoops.add(chickenCoop3);
        froilansChickenCoops.add(chickenCoop4);

        List<Stable> froilansStables = froilansFarm.getStables();
        Stable stable1 = new Stable(2);
        Stable stable2 = new Stable(3);
        Stable stable3 = new Stable(5);

        List<FarmVehicle> froilansFarmVehicles = froilansFarm.getFarmVehicles();
        FarmVehicle tractor = new Tractor();
        FarmVehicle cropDuster = new CropDuster();
        froilansFarmVehicles.add(tractor);
        froilansFarmVehicles.add(cropDuster);

        Pilot froilanda = new Pilot((Aircraft) cropDuster);

        froilansFarm.getFarmHouse().getPeople().add(froilan);
        froilansFarm.getFarmHouse().getPeople().add(froilanda);

    }

    public Farm getFroilansFarm() {
        return froilansFarm;
    }

    public void setFroilansFarm(Farm froilansFarm) {
        this.froilansFarm = froilansFarm;
    }

    public Farmer getFroilan() {
        return froilan;
    }

    public void setFroilan(Farmer froilan) {
        this.froilan = froilan;
    }

    public Field getFroilansField() {
        return froilansField;
    }

    public void setFroilansField(Field froilansField) {
        this.froilansField = froilansField;
    }

    public static void main(String[] args) {


    }

    public Pilot getFroilanda() {
        return (Pilot)froilansFarm.getFarmHouse().getPeople().get(1);
    }
}
package com.zipcodewilmington.froilansfarm.FarmStructures;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;

import java.util.ArrayList;
import java.util.List;

public class Field {

     private List<CropRow> cropRows = new ArrayList<>();


    public Field(List<CropRow> cropRows) {
        this.cropRows = cropRows;
    }
}

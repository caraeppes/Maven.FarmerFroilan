package com.zipcodewilmington.froilansfarm.FarmStructures;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;

import java.util.ArrayList;
import java.util.List;

public class Field {

    private List<CropRow> cropRows = new ArrayList<>();

    public Field() {
    }

    public List<CropRow> getCropRows() {
        return cropRows;
    }

    public void add(CropRow cropRow) {
        cropRows.add(cropRow);
    }
}

package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Edibles.Crop;

import java.util.ArrayList;
import java.util.List;

public class CropRow {

    private List<Crop> crops;

    public CropRow(){
        crops = new ArrayList<>();
    }

    public CropRow(List<Crop> crops) {
        this.crops = crops;
    }

    public List<Crop> getCrops() {
        return crops;
    }

    public void setCrops(List<Crop> crops) {
        this.crops = crops;
    }

    public void addCrop(Crop crop){
        crops.add(crop);
    }
}

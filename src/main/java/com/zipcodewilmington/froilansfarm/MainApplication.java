package com.zipcodewilmington.froilansfarm;


public class MainApplication {

    FroilansFarm froilansFarm = FroilansFarm.getInstance();

    public static void main(String[] args) {
    }

    public FroilansFarm getFroilansFarm() {
        return froilansFarm;
    }

}



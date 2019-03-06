package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Interfaces.Person;

public abstract class PersonDecorator implements Person {

    public  Person decoratedPerson;

    public PersonDecorator(Person decoratedPerson){
        this.decoratedPerson = decoratedPerson;
    }


}

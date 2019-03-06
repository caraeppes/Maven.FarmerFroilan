package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.People.Person;

public abstract class PersonDecorator implements Person {

    protected Person decoratedPerson;

    public PersonDecorator(Person decoratedPerson){
        this.decoratedPerson = decoratedPerson;
    }


}

package com.zipcodewilmington.froilansfarm.FarmStructures;

import com.zipcodewilmington.froilansfarm.People.Person;

import java.util.List;

public class FarmHouse {

    private List<Person> people;

    public FarmHouse() {
    }

    public FarmHouse(List<Person> people) {
        this.people = people;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }
}

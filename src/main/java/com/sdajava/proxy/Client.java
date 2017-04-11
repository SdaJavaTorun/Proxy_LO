package com.sdajava.proxy;

/**
 * Created by lukas on 11.04.2017.
 */
public class Client implements User{

    private String name;
    private String lastname;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

    public void save() {
        //zapis
    }

    public void delete() {
        //usuwanie
    }
}

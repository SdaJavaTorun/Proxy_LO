package com.sdajava.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukas on 11.04.2017.
 */
public class Client implements User{

    List<Client> listOfClients = new ArrayList<Client>();

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
        listOfClients.add(this);
    }

    public void delete() {
        //usuwanie
    }
}

package com.sdajava.proxy;

/**
 * Created by lukas on 11.04.2017.
 */
public class Proxy implements User{

    private Client client;

    public Proxy() {
        this.client = new Client();
    }

    public String getName() {
        return this.client.getName();
        // inne operacje
    }

    public void setName(String name) {
        this.client.setName(name);
        //inne operacje
    }

    public String getLastName() {
        return this.client.getLastName();
        //inne operacje
    }

    public void setLastName(String lastName) {
        this.client.setLastName(lastName);
        //inne operacje
    }

    public void save() {
        this.client.save();
    }

    public void delete() {
        //usuwanie
    }
}

package com.sdajava.proxy;

/**
 * Created by lukas on 11.04.2017.
 */
public interface User {

    public String getName();
    public void setName(String name);
    public String getLastName();
    public void setLastName(String lastName);
    public void save();
    public void delete();
}

package com.sdajava.proxy;

public class Main {

    public static void main(String[] args) {

        User user = new Proxy();

        user.setName("Karolina");
        user.setLastName("Kowalska");
        user.save();



    }
}

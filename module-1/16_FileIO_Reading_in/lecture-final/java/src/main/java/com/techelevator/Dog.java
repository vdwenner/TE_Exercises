package com.techelevator;

public class Dog {

    private String name;
    private String treat;

    public Dog(){
        this.name = "Fido";
        this.treat = "Cookie";
    }

    public Dog(String name, String treat){
        this.name = name;
        this.treat = treat;
    }

    @Override
    public String toString(){
        return this.name + " likes to eat " + this.treat;
    }

}

package com.techelevator;

public class Thing {

    private String name = "Thingy";

    public String getName(){
        return this.name;
    }

    public int age = 0;

    public Thing(){
        this.name = "Instantiated Thing";
    }

    public Thing( String overrideName){
        this.name = overrideName;
    }

    public Thing getNewThing(){

        Thing theNewThing = new Thing("A thing I made in a method");

        theNewThing.age = 4;

        return  theNewThing;

    }

}

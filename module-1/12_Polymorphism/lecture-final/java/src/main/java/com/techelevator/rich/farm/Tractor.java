package com.techelevator.rich.farm;

public class Tractor implements Singable, Rideable{

    private String name;
    private String sound;

    public Tractor(){
        this.name = "Big Green";
        this.sound = "Vroom!";
    }

    public String getName(){
        return this.name;
    }

    public String getSound(){
        return this.sound;
    }

    @Override
    public void Ride() {
        System.out.println("Yee Haw!");
    }
}

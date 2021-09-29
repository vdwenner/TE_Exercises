package com.techelevator.rich.farm;

public class Cow extends FarmAnimal implements Rideable {

    public Cow() {

        super("Cow", "moo!");
    }

    @Override
    public void Ride() {
        System.out.println("Ooo, ouch");
    }
}

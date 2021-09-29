package com.techelevator.rich.farm;

public class Chicken extends FarmAnimal {

    public Chicken() {

        super("Chicken", "cluck!");
    }

    public void layEgg() {
        System.out.println("Bwok, Chicken laid an egg!");
    }

}
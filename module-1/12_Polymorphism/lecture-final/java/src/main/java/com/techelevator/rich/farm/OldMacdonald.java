package com.techelevator.rich.farm;

import java.util.ArrayList;
import java.util.List;

public class OldMacdonald {
    public static void main(String[] args) {

        Cow daisy = new Cow();
        Chicken fred = new Chicken();
        Tractor bigGreen = new Tractor();

        List<Singable> singableThings = new ArrayList<>();
        singableThings.add(daisy);
        singableThings.add(fred);
        singableThings.add(bigGreen);


        for (Singable thing : singableThings) {
            String name = thing.getName();
            String sound = thing.getSound();
            System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
            System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
            System.out.println("With a " + sound + " " + sound + " here");
            System.out.println("And a " + sound + " " + sound + " there");
            System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);

            if(thing instanceof Rideable){
                System.out.println("Go for a ride on " + thing.getName() + " and experience the " + thing.getSound() + "!");
                ((Rideable)thing).Ride() ;
            }

            System.out.println();
        }

//		List<Rideable> rideableThings = new ArrayList<>();
//		rideableThings.add(daisy);
//		rideableThings.add(bigGreen);
//
//		for (Rideable thing: rideableThings){
//
//			if( thing instanceof Singable){
//				Singable singableRideableThing = (Singable) thing;
//
//				System.out.println("Go for a ride on " + singableRideableThing.getName() + " and experience the " + singableRideableThing.getSound() + "!");
//
//			}
//		}


    }
}
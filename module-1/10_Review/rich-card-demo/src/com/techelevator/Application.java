package com.techelevator;

public class Application {

    public static void main(String[] args) {

        Thing myThing = new Thing();

        System.out.println(myThing);

        System.out.println(myThing.getName());

        Thing myOtherThing = new Thing("Blue Dog");

        System.out.println(myOtherThing.getName());

        Thing theNewThingMyOtherThingMade = myOtherThing.getNewThing();

        System.out.println(theNewThingMyOtherThingMade);

        System.out.println(myOtherThing.getNewThing());
        System.out.println(myOtherThing.getNewThing());
        System.out.println(myOtherThing.getNewThing());

        System.out.println(theNewThingMyOtherThingMade);

    }

}

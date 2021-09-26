package com.techelevator.draw.tool;

public class User {

    private static int number = 2;

    private String firstName;
    private String lastName;

    public String greeting;

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String fullName(){
        return  this.firstName + " " + this.lastName;
    }

    public User(){
        this("Default", "User");

        this.greeting = "Hello";
    }

    //Overload Constructor
    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Static Methods - Only Available on the Class itself, NOT an instance
    public static void stateIntent(){
        System.out.println("I am just a class, but I really want to be a real object");
    }

    //Instance Methods - Only available to instances of the class aka Objects
    public void respondToGreeting(){
        System.out.println(this.greeting + ", " + "My name is " + this.firstName + " " + this.lastName);
    }
}

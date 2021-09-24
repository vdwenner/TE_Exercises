package com.techelevator.draw.tool;

public class UserManager {

    public static void main(String[] args) {

        User.stateIntent();

        User customer = new User();

        User nextCustomer = new User("Bob", "Smoth");

        System.out.println(customer.greeting + ", " + customer.fullName());
        customer.respondToGreeting();


        nextCustomer.greeting = "Hola!";
        System.out.println(nextCustomer.greeting + ", " + nextCustomer.fullName());
        nextCustomer.respondToGreeting();


    }

}

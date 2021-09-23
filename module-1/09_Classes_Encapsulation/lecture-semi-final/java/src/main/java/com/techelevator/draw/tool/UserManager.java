package com.techelevator.draw.tool;

public class UserManager {

    public static void main(String[] args) {

        //Call the static method of the User class
        User.stateIntent();

        //Instantiate a new instance of a  User using the Default Constructor of the User class
        User customer = new User();

        //Instantiate a new instance of a  User using the Overload Constructor of the User Class
        User nextCustomer = new User("Bob", "Smoth");

        System.out.println(customer.greeting + ", " + customer.fullName());
        customer.respondToGreeting();


        nextCustomer.greeting = "Hola!";
        System.out.println(nextCustomer.greeting + ", " + nextCustomer.fullName());
        nextCustomer.respondToGreeting();


    }

}

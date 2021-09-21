package com.techelevator;

public class Dog {

    public String sound = "woof!";
    public String name = "";

    public Dog(String name){
        this.name = name;
    }

    public void knightMe(){
        this.name = "Knightly " + name;
    }

}

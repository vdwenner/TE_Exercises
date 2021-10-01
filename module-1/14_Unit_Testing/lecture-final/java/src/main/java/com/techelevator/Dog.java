package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Dog {

    public static final String ANGRY = "Angry";
    public static final String HUNGRY = "Hungry";
    public static final String TIRED = "Tired";
    public static final String NEUTRAL = "Neutral";

    private String name;
    private int age;
    private String beggingSound;
    private String alertSound;
    private boolean adopted;
    private String mood;

    private List<Dog> puppies = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    public String getBeggingSound() {
        return beggingSound;
    }

    public void setBeggingSound(String beggingSound) {
        this.beggingSound = beggingSound;
    }

    public String getAlertSound() {
        return alertSound;
    }

    public void setAlertSound(String alertSound) {
        this.alertSound = alertSound;
    }

    public List<Dog> getPuppies() {
        return puppies;
    }

    public void setPuppies(List<Dog> puppies) {
        this.puppies = puppies;
    }

    public String getMood() {
        return mood;
    }

    public Dog(){
        this.name = "Spot";
        this.age = 1;
        this.adopted = true;
    }

    public Dog(String name, int age, String beggingSound, String alertSound) {
        this.name = name;
        this.age = age;
        this.beggingSound = beggingSound;
        this.alertSound = alertSound;
    }

    public String alert(){
        this.mood = Dog.ANGRY;
        return this.alertSound;
    }
}

package com.techelevator;

public class Zombie extends HalloweenMonster{

    public Zombie(){
        super();
    }

    public Zombie(String humanName, String monsterName, int age, int scariness, String scaryPhrase, String trick){

        this.humanName = humanName;
        this.monsterName = monsterName;
        this.scaryPhrase = scaryPhrase;
        this.trickDesc = trick;
        this.scariness = scariness;

    }

    public String performHalloweenAct(){

        String act = "Uhhhh";

        switch(impression()){

            case "funny":
                act += ", Aren't I cute!?";
                break;
            case "tricky":
                act = trick();
                break;
            case "scary":
                act = scare();
                break;
        }

        return act;
    }

    public String scare(){
        System.out.println(this.monsterName + ", " + this.humanName + ", says " + scaryPhrase);
        return scaryPhrase;
    }

    public String trick(){
        System.out.println(this.monsterName + ", " + this.humanName + ", performs " + trickDesc);
        return trickDesc;
    }

    private String impression(){
        String result = "meh";

        if(scariness == 0){result = "funny";}

        if(scariness >= 1 && scariness <= 5){result = "tricky";}

        if(scariness >= 6 && scariness <= 10){result = "scary";}

        return result;
    }

}

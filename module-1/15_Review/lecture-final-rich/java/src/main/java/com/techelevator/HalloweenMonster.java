package com.techelevator;

public abstract class HalloweenMonster implements Scary, Tricky{

    protected String humanName;
    protected String monsterName;
    protected int age = 10;
    protected int scariness;
    protected String scaryPhrase;
    protected String trickDesc;

    public String getHumanName() {return humanName;}

    public String getMonsterName() {return monsterName;}

    public int getAge() {return age;}

    public int getScariness() {return scariness;}

    public String getScaryPhrase() {return scaryPhrase;}

    public String getTrickDesc() {return trickDesc;}

    public HalloweenMonster(){
        this.humanName = "Some Kid";
        this.scariness = 0;
    }

    abstract String performHalloweenAct();
}

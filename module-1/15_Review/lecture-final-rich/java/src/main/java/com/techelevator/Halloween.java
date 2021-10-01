package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Halloween {

    public static void main(String[] args) {

        System.out.println("*********************");
        System.out.println("  HAPPY HALLOWEEN");
        System.out.println("*********************");

        Zombie zed = new Zombie("Billy", "Runner Zombie", 8, 4, "BRAIIINS, nom, nom, nom", "I can pull off my finger!");
        Werewolf bowwow = new Werewolf("Sally", "Super Realistic Werewolf", 6, 9, "GROWLLLL! Chomp, Chomp, Chomp", "I can smell your fear");
        Ghost bedsheet = new Ghost("Timmeh", "Power Rangers blanket Ghost", 5, 2, "Boooo! I WILL Haunt You!", "I can jump out of your closet");
        Zombie wthZed = new Zombie("Mark", "Really smelly decaying Zombie", 8, 10, "BRAIIINS, squish, nom, plop", "I can stink up your porch");
        Werewolf fleaBag = new Werewolf("????", "Itchy Werewolf", 24, 6, "GROWLLLL! Itch Human!", "I can scratch behind my ears");


//        System.out.println(zed.performHalloweenAct());
//        System.out.println(bowwow.performHalloweenAct());
//        System.out.println(bedsheet.performHalloweenAct());
//        System.out.println(wthZed.performHalloweenAct());
//        System.out.println(fleaBag.performHalloweenAct());

        List<HalloweenMonster> myFrontDoorMonsters = new ArrayList<>();

        myFrontDoorMonsters.add(zed);
        myFrontDoorMonsters.add(bowwow);
        myFrontDoorMonsters.add(bedsheet);
        myFrontDoorMonsters.add(wthZed);
        myFrontDoorMonsters.add(fleaBag);

        for(HalloweenMonster monster : myFrontDoorMonsters){
            monster.performHalloweenAct();
        }


    }
}

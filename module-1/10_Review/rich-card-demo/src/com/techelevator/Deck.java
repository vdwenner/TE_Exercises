package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> listOfCards = new ArrayList<>();

    public List<Card> getListOfCards(){
        return this.listOfCards;
    }

    public Deck(int[] suits, int[] ranks, Card[] additionalCard){

        for(int suit: suits){
            for(int rank: ranks){
                //Card addCard = new Card(suit, rank);
                listOfCards.add(new Card(suit, rank));
            }
        }

        Collections.shuffle(this.listOfCards);

    }



}

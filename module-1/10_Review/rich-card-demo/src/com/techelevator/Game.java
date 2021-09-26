package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Game {

    //WHAT DEFINES A GAME ND ITS DECK?

    public static final int NIL = 0;
    public static final int SPADES = 1;
    public static final int DIAMONDS = 2;
    public static final int CLUBS = 3;
    public static final int HEARTS = 4;

    public static final int JOKER = 0;
    public static final int ACE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static final int SEVEN = 7;
    public static final int EIGHT = 8;
    public static final int NINE = 9;
    public static final int TEN = 10;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;

    public static Map<Integer, String> suitMap = Map.of(1, "Spades",2, "Diamonds",3, "Clubs", 4, "Hearts");

    private Deck gameDeck;

    private int[] pokerSuits = new int[] {SPADES, DIAMONDS, CLUBS, HEARTS};
    private int[] pokerRanks = new int[] { ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING };

    public Game(){
        this.gameDeck = new Deck(pokerSuits,pokerRanks, null);

    }

    public Card dealCard(){
        if(gameDeck.getListOfCards().size() >= 1) {
            return gameDeck.getListOfCards().remove(0);
        }
        return null;
    }

}

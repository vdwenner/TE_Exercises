package com.techelevator;

public class Card {
    // attributes of a card
    // -- suit
    // -- rank
    // -- facedown/faceup
    // ?? Back Design

    private int suit;
    private int rank;
    private boolean faceDown;
    private String backDesign;

    //Getter and Setters


    public boolean isFaceDown() {
        return this.faceDown;
    }

    public int getSuit(){
        return this.suit;
    }

    public int getRank() {
        return this.rank;
    }

    // Constructor
    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
        this.backDesign = "Bicycle";
    }

    public Card(int suit, int rank, String backDesign){
            this.suit = suit;
            this.rank = rank;
            this.backDesign = backDesign;
    }

    //Methods

    public void flip(){
        this.faceDown = !this.faceDown;
    }
    public String toString(){
        return this.suit + ":" + this.rank + ":" + this.backDesign;
    }
    public boolean equals(Card card){
        return (this.suit == card.getSuit() && this.rank == card.getRank());
        }

}

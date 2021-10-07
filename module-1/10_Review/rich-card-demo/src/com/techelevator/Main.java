package com.techelevator;

public class Main {

    public static void main(String[] args) {
        // write your code here


        // ** TEST THE CARD CLASS **

        System.out.println("*************************");
        System.out.println("** TEST THE CARD CLASS **");
        System.out.println("*************************");

        Card myCard = new Card(1, 8);
        Card yourCard = new Card(1, 3);
        Card theirCard = new Card(1, 8);

        System.out.println(myCard);

        System.out.println("Mine and Yours the same? " + myCard.equals(yourCard));
        System.out.println("Mine and Theirs the same? " + myCard.equals(theirCard));

        System.out.println("*************************");
        System.out.println();

//        int[] gameSuits = {1,2,3,4};
//        int[] gameRanks = {1,2,3,4,5,6,7,8};
//        Card[] additionalCard = new Card[]{};
//
//        Deck myDeck = new Deck(gameSuits, gameRanks, additionalCard);
//
//        for(Card deckCard : myDeck.getListOfCards()){
//            System.out.println(deckCard.toString());
//        }

        Game pokerGame = new Game();

        Card[] dealtHand = new Card[5];

        for (int i = 0; i < dealtHand.length; i++) {
            dealtHand[i] = pokerGame.dealCard();
        }

        System.out.println("**** YOUR HAND ****");
        for (int i = 0; i < dealtHand.length; i++) {
            System.out.println(reportCard(dealtHand[i]));
        }
        System.out.println();

        int randomCardInHand = (int)(Math.floor(Math.random() * 5.2));

        dealtHand[randomCardInHand].flip();

        System.out.println( "**** RANDOM CARD FLIP ****");

        for (int i = 0; i < dealtHand.length; i++) {
            System.out.println(reportCard(dealtHand[i]));
        }

    }

    public static String reportCard(Card card){
        return (card.isFaceDown())?"******":card.toString();
    }
}

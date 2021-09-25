package com.techelevator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Card myCard = new Card(1,8);
        Card yourCard = new Card(1,8);
        Card theirCard = new Card(1,8);

        System.out.println(myCard);

        System.out.println("Mine and Yours the same?" + myCard.equals(yourCard));
        System.out.println("Mine and Theirs the same?" + myCard.equals(theirCard));

        System.out.println("*************************");


    }
}

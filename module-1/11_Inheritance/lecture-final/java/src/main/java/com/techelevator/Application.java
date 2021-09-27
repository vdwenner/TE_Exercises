package com.techelevator;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");

        System.out.println("The " + generalAuction.getItemForSale() + " Auction!");

        generalAuction.placeBid(new Bid("Josh", 1));
        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 13));
        generalAuction.placeBid(new Bid("Ash", 25));
        generalAuction.placeBid(new Bid("Ripley", 45));
        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids

        System.out.println("Current Bids: " + generalAuction.getAllBids().size());
        System.out.println("High Bidder: " + generalAuction.getHighBid().getBidder() + ": " + generalAuction.getHighBid().getBidAmount());

        System.out.println();
        System.out.println("Starting a Buyout auction");
        System.out.println("-----------------");

        BuyoutAuction buyoutTEYeti = new BuyoutAuction("TE Yeti Mug", 100);

        System.out.println("The " + buyoutTEYeti.getItemForSale() + " Auction!");
        System.out.println("You can have it NOW for just " + buyoutTEYeti.getBuyoutPrice() + " TE Bucks");

        buyoutTEYeti.placeBid(new Bid("Face Hugger", 25));
        buyoutTEYeti.placeBid(new Bid("Alien Queen", 75));
        buyoutTEYeti.placeBid(new Bid("Rick Astley", 13));
        buyoutTEYeti.placeBid(new Bid("Ash", 150));
        buyoutTEYeti.placeBid(new Bid("Ripley", 175));

        System.out.println("Current Bids: " + buyoutTEYeti.getAllBids().size());
        System.out.println("High Bidder: " + buyoutTEYeti.getHighBid().getBidder() + ": " + buyoutTEYeti.getHighBid().getBidAmount());

        System.out.println();
        System.out.println("Starting a Reserve auction");
        System.out.println("-----------------");

        ReserveAuction reserveTESwagBag = new ReserveAuction("TE Swag Bag of Awesome", 150);

        reserveTESwagBag.placeBid(new Bid("Face Hugger", 75));
        reserveTESwagBag.placeBid(new Bid("Alien Queen", 150));
        reserveTESwagBag.placeBid(new Bid("Rick Astley", 20));
        reserveTESwagBag.placeBid(new Bid("Ash", 151));
        reserveTESwagBag.placeBid(new Bid("Ripley", 120));

        System.out.println("There are " + reserveTESwagBag.getAllBids().size() + " accepted bids");

        System.out.println("Current Bids: " + reserveTESwagBag.getAllBids().size());
        System.out.println("High Bidder: " + reserveTESwagBag.getHighBid().getBidder() + ": " + reserveTESwagBag.getHighBid().getBidAmount());

    }
}

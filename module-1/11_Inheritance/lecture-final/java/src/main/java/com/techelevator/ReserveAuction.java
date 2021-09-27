package com.techelevator;

public class ReserveAuction extends Auction{

    private int reservePrice;

    //This ReserveAuction constructor MUST invoke the Auction constructor FIRST
    public ReserveAuction(String itemForSale, int reservePrice){
        super(itemForSale);
        this.reservePrice = reservePrice;
    }

    /*
     * This class overrides the default placeBid behavior of the parent class.
     * If the offeredBid does not meet or exceed the reserve price, the bid
     * is ignored.
     */

    public String announceWinner(){
        return "This Winner is: " + super.getHighBid().getBidder();
    }

    @Override
    public boolean placeBid(Bid offeredBid){

        System.out.println(offeredBid.getBidder() + " has placed a bid");

        boolean isCurrentWinningBid = false;

        if(offeredBid.getBidAmount() >= this.reservePrice){
            // ALL I HAVE TO DO IS CALL AUCTION PLACEBID ONCE I KNOW
            //  THAT THE OFFEREDBID MEETS THE RESERVE REQUIREMENT
            isCurrentWinningBid = super.placeBid(offeredBid);
        }

        if(isCurrentWinningBid){
            System.out.println(announceWinner());
        }

        return isCurrentWinningBid;
    }

}

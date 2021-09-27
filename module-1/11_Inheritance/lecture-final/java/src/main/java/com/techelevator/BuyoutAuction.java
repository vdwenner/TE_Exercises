package com.techelevator;

public class BuyoutAuction extends Auction{

    private int buyoutPrice;

    public int getBuyoutPrice(){
        return this.buyoutPrice;
    }

    public BuyoutAuction(String itemForSale, int buyoutPrice){
        super(itemForSale);
        this.buyoutPrice = buyoutPrice;
    }

    /*
     * This class overrides the default placeBid behavior of the parent class.
     * If the offeredBid meets or exceeds the buyout price, the bid is set
     * to the buyout price and all future bids are ignored.
     */

    @Override
    public boolean placeBid(Bid offeredBid){

        boolean isCurrentWinningBid = false;
        // Is the buyoutAuction still accepting bids?
        if (getHighBid().getBidAmount() < this.buyoutPrice){

            if( offeredBid.getBidAmount() >= this.buyoutPrice){
                offeredBid = new Bid(offeredBid.getBidder(), this.buyoutPrice);
            }
            // The remaining processing is exactly the same as in an Auction
            isCurrentWinningBid = super.placeBid(offeredBid);

        }

        return isCurrentWinningBid;
    }


}

package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.*;

import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.*;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    public AuctionDao dao;

    public AuctionController() {
         dao = new MemoryAuctionDao();
    }


    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<Auction> list (@RequestParam(required = false) String title_like, @RequestParam(required = false, defaultValue = "0") Double currentBid_lte){
        if ((title_like != null) && (currentBid_lte > 0)){
            return dao.searchByTitleAndPrice(title_like, currentBid_lte);
        }
        if (title_like != null || currentBid_lte > 0) {
            if (title_like != null) {
                return dao.searchByTitle(title_like);
            }
            if (currentBid_lte > 0) {
                return dao.searchByPrice(currentBid_lte);
            }
        }
        return dao.list();
    }

    @RequestMapping(path = "/{auctionId}", method = RequestMethod.GET)
    public Auction getAuction(@PathVariable int auctionId){
        return dao.get(auctionId);
    }

    @RequestMapping(path = "", method = RequestMethod.POST)
    public Auction create(@RequestBody Auction newAuction) {
        return dao.create(newAuction);
    }


}

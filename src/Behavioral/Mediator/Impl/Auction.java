package Behavioral.Mediator.Impl;

import Behavioral.Mediator.Interface.AuctionMediator;
import Behavioral.Mediator.Interface.Colleague;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator {
    List<Colleague> list = new ArrayList<>();
    @Override
    public void addBidder(Colleague bidder) {
        list.add(bidder);
    }

    @Override
    public void placeBid(Colleague bidder, int amount) {
        list.forEach(element -> {
            if(!element.getName().equals(bidder.getName())) {
                element.receiveBidNotification(amount);
            }
        });
    }
}

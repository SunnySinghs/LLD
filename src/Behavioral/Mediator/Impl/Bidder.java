package Behavioral.Mediator.Impl;

import Behavioral.Mediator.Interface.Colleague;
import Behavioral.Mediator.Interface.AuctionMediator;

public class Bidder implements Colleague {

    private AuctionMediator auctionMediator;
    private String name;

    public Bidder(AuctionMediator auctionMediator, String name) {
        this.auctionMediator = auctionMediator;
        this.name = name;
        auctionMediator.addBidder(this);
    }

    @Override
    public String  getName() {
        return name;
    }

    @Override
    public void placeBid(int amount) {
        auctionMediator.placeBid(this, amount);
    }

    @Override
    public void receiveBidNotification(int amount) {
        System.out.println("Bidder: " + name +" get the notification that someone else has put the bid of Rs. "+amount);
    }
}

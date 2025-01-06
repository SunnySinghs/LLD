package Behavioral.Mediator;

import Behavioral.Mediator.Impl.Auction;
import Behavioral.Mediator.Impl.Bidder;
import Behavioral.Mediator.Interface.AuctionMediator;
import Behavioral.Mediator.Interface.Colleague;

//BDP
//It encourages loose coupling by keeping objects from referring to each other explicitly and allow to communicate
// through a mediator object
public class Main {
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new Auction();
        Colleague bidder1 = new Bidder(auctionMediator, "Bidder1");
        Colleague bidder2 = new Bidder(auctionMediator, "Bidder2");

        bidder1.placeBid(100);
        bidder2.placeBid(200);
        bidder1.placeBid(300);
    }
}

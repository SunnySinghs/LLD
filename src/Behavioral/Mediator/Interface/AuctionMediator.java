package Behavioral.Mediator.Interface;

public interface AuctionMediator {
    public void addBidder(Colleague bidder);

    public void placeBid(Colleague bidder, int amount);
}

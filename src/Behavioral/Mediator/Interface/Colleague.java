package Behavioral.Mediator.Interface;

public interface Colleague {
    public void placeBid(int amount);
    public void receiveBidNotification(int amount);
    public String getName();
}

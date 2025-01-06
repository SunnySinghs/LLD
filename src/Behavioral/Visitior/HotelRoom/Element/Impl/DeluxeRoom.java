package Behavioral.Visitior.HotelRoom.Element.Impl;

import Behavioral.Visitior.HotelRoom.Element.RoomElement;
import Behavioral.Visitior.HotelRoom.Visitor.RoomVisitor;

public class DeluxeRoom implements RoomElement {
    public int price = 0;
    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
        //Double Dispatch: It means, the method needs to invoked decided by the caller object and the object passed in the argument.
    }
}

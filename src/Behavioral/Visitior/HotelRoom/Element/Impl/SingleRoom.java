package Behavioral.Visitior.HotelRoom.Element.Impl;

import Behavioral.Visitior.HotelRoom.Element.RoomElement;
import Behavioral.Visitior.HotelRoom.Visitor.RoomVisitor;

public class SingleRoom implements RoomElement {
    public int price = 0;
    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
}

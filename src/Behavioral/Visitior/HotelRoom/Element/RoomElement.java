package Behavioral.Visitior.HotelRoom.Element;

import Behavioral.Visitior.HotelRoom.Visitor.RoomVisitor;

public interface RoomElement {
    public void accept(RoomVisitor visitor);
}

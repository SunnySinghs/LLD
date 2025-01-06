package Behavioral.Visitior.HotelRoom.Visitor;

import Behavioral.Visitior.HotelRoom.Element.Impl.DeluxeRoom;
import Behavioral.Visitior.HotelRoom.Element.Impl.DoubleRoom;
import Behavioral.Visitior.HotelRoom.Element.Impl.SingleRoom;

public interface RoomVisitor {
    public void visit(SingleRoom singleRoomObj);
    public void visit(DoubleRoom doubleRoomObj);
    public void visit(DeluxeRoom deluxeRoomObj);
}

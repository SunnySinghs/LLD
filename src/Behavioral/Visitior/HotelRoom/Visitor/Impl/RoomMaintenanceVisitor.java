package Behavioral.Visitior.HotelRoom.Visitor.Impl;

import Behavioral.Visitior.HotelRoom.Element.Impl.DeluxeRoom;
import Behavioral.Visitior.HotelRoom.Element.Impl.DoubleRoom;
import Behavioral.Visitior.HotelRoom.Element.Impl.SingleRoom;
import Behavioral.Visitior.HotelRoom.Visitor.RoomVisitor;

public class RoomMaintenanceVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoom singleRoomObj) {
        System.out.println("Performing maintenance of Single room");
    }

    @Override
    public void visit(DoubleRoom doubleRoomObj) {
        System.out.println("Performing maintenance of Double room");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoomObj) {
        System.out.println("Performing maintenance of Deluxe room");
    }
}

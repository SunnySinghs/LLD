package Behavioral.Visitior.HotelRoom.Visitor.Impl;

import Behavioral.Visitior.HotelRoom.Element.Impl.DeluxeRoom;
import Behavioral.Visitior.HotelRoom.Element.Impl.DoubleRoom;
import Behavioral.Visitior.HotelRoom.Element.Impl.SingleRoom;
import Behavioral.Visitior.HotelRoom.Visitor.RoomVisitor;

public class RoomPricingVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoom singleRoomObj) {
        System.out.println("Pricing calculation logic for Single room");
        singleRoomObj.price = 1000;
    }

    @Override
    public void visit(DoubleRoom doubleRoomObj) {
        System.out.println("Pricing calculation logic for Double room");
        doubleRoomObj.price = 2000;
    }

    @Override
    public void visit(DeluxeRoom deluxeRoomObj) {
        System.out.println("Pricing calculation logic for Deluxe room");
        deluxeRoomObj.price = 3000;
    }
}

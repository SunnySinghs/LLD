package Behavioral.Visitior.HotelRoom;

import Behavioral.Visitior.HotelRoom.Element.Impl.DeluxeRoom;
import Behavioral.Visitior.HotelRoom.Element.Impl.DoubleRoom;
import Behavioral.Visitior.HotelRoom.Element.Impl.SingleRoom;
import Behavioral.Visitior.HotelRoom.Element.RoomElement;
import Behavioral.Visitior.HotelRoom.Visitor.Impl.*;
import Behavioral.Visitior.HotelRoom.Visitor.RoomVisitor;

//Objective: It allows you to add new operations to existing classes without changing their structure.
//           It achieves this by separating the operations from the objects on which it operates.
//Double Dispatch: It means, the method needs to invoked decided by the caller object and the object passed in the argument.
public class Main {
    public static void main(String[] args) {
        RoomElement singleRoom = new SingleRoom();
        RoomElement doubleRoom = new DoubleRoom();
        RoomElement deluxeRoom = new DeluxeRoom();

        RoomVisitor pricingVisitor = new RoomPricingVisitor();
        singleRoom.accept(pricingVisitor);
        System.out.println(((SingleRoom)singleRoom).price);

        doubleRoom.accept(pricingVisitor);
        System.out.println(((DoubleRoom)doubleRoom).price);

        deluxeRoom.accept(pricingVisitor);
        System.out.println(((DeluxeRoom)deluxeRoom).price);

        RoomVisitor maintenanceVisitor = new RoomMaintenanceVisitor();
        singleRoom.accept(maintenanceVisitor);

        doubleRoom.accept(maintenanceVisitor);

        deluxeRoom.accept(maintenanceVisitor);
    }
}

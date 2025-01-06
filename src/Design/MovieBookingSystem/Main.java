package Design.MovieBookingSystem;

import Design.MovieBookingSystem.Enum.City;

public class Main {
    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();
        bookMyShow.intialize();
        //user1
        bookMyShow.createBooking(City.BANGLORE, "BAAHUBALI");
        //user2
        bookMyShow.createBooking(City.BANGLORE, "BAAHUBALI");

    }
}

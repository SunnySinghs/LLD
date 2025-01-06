package Design.MovieBookingSystem;

import Design.MovieBookingSystem.Enum.City;

public class Address {
    private int pincode;
    private City city;

    public Address(int pincode, City city) {
        this.pincode = pincode;
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}

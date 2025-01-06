package Design.OrderManagementSystem;

import Design.ATM.Card;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private Address address;
    private Cart userCartDetails;
    List<Integer> orderIds;

    public User(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.userCartDetails = new Cart();
        this.orderIds = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Cart getUserCartDetails() {
        return userCartDetails;
    }

    public List<Integer> getOrderIds() {
        return orderIds;
    }
}

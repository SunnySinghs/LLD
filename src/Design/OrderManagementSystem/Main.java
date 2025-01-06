package Design.OrderManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        List<WareHouse> wareHouseList = new ArrayList<>();
        wareHouseList.add(main.addWarehouseAndInventory());

        List<User> userList = new ArrayList<>();
        userList.add(main.crateUser());

        OrderDeliverySystem orderDeliverySystem = new OrderDeliverySystem(wareHouseList, userList);
    }

    private WareHouse addWarehouseAndInventory() {
        WareHouse wareHouse = new WareHouse();

        ProductInventory productInventory = new ProductInventory();

        productInventory.addProduct(1, "Pepsi", 40, 10);
        productInventory.addProduct(2, "Juice", 20, 20);
        productInventory.addProduct(3, "Dove", 80, 5);

        wareHouse.setInventory(productInventory);
        return wareHouse;
    }

    private User crateUser() {
        User user = new User(1, "Sam", new Address(230011, "city", "state"));
        return user;
    }

    private void runDeliveryFlow(OrderDeliverySystem orderDeliverySystem, int userId) {
        User user = orderDeliverySystem.getUser(userId);
        WareHouse wareHouse = orderDeliverySystem.getWareHouse(new NearestWareHouseSelectionStrategy());
        ProductInventory productInventory = orderDeliverySystem.getProductInventory(wareHouse);

        Product productIwannaOrder = null;
        for (Product product: productInventory.getProducts()) {
            if (product.getName().equals("Pepsi")) {
                productIwannaOrder = product;
            }
        }

        orderDeliverySystem.addProductToCart(user, productIwannaOrder, 2);
        Order order = orderDeliverySystem.placeOrder(user, wareHouse, new UPIPaymentMode());
        orderDeliverySystem.checkout(order);
    }
}

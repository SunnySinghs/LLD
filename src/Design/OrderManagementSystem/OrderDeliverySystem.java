package Design.OrderManagementSystem;

import java.util.List;

public class OrderDeliverySystem {

    private UserController userController;
    private WareHouseController wareHouseController;
    private OrderController orderController;

    public OrderDeliverySystem(List<WareHouse> wareHouseList, List<User> userList) {
        this.userController = new UserController(userList);
        this.wareHouseController = new WareHouseController(wareHouseList, new NearestWareHouseSelectionStrategy());
        this.orderController = new OrderController();
    }

    //get user object
    public User getUser(int userId) {
        return userController.getUser(userId);
    }

    //get warehouse
    public WareHouse getWareHouse(WareHouseStrategy wareHouseStrategy) {
        return wareHouseController.selectWareHouse(wareHouseStrategy);
    }

    //get inventory
    public ProductInventory getProductInventory(WareHouse wareHouse) {
        return wareHouse.getInventory();
    }

    //add product to cart
    public void addProductToCart(User user, Product product, int count) {
        Cart cart = user.getUserCartDetails();
        cart.addItem(product.getId(),count);
    }

    //place order
    public Order placeOrder(User user, WareHouse wareHouse, PaymentMode mode) {
        return orderController.createOrder(user, wareHouse, mode);
    }

    //Checkout
    public void checkout(Order order) {
        order.checkout();
    }
}

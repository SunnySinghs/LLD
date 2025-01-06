package Design.OrderManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderController {
    private List<Order> orderList;
    private Map<Integer, List<Order>> userIdVsOrder;

    public OrderController() {
        this.orderList = new ArrayList<>();
        this.userIdVsOrder = new HashMap<>();
    }

    public Order createOrder(User user, WareHouse wareHouse, PaymentMode mode) {
        Order order = new Order(user, wareHouse, mode);
        orderList.add(order);

        if (userIdVsOrder.containsKey(user.getId())) {
            List<Order> orders = userIdVsOrder.get(user.getId());
            orders.add(order);
            userIdVsOrder.put(user.getId(), orders);
        } else {
            List<Order> orderList = new ArrayList<>();
            orderList.add(order);
            userIdVsOrder.put(user.getId(), orderList);
        }
        return order;
    }

    public void removeOrder(Order order) {
        //Remove order logic
    }
}

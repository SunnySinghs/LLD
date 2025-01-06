package Design.OrderManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Integer, Integer> orderItemMap;

    public Cart() {
        this.orderItemMap = new HashMap<>();
    }

    public void addItem(int productId, int count) {
        orderItemMap.putIfAbsent(productId, orderItemMap.getOrDefault(productId, 0)+count);
    }

    public void removeItem(int productId, int count) {
        if (orderItemMap.containsKey(productId)) {
            int noOfItems = orderItemMap.get(productId);
            if (noOfItems - count <= 0) {
                orderItemMap.remove(productId);
            } else {
                orderItemMap.put(productId, noOfItems-count);
            }
        }
    }

    public void emptyCart() {
        orderItemMap = new HashMap<>();
    }

    public Map<Integer, Integer> getCartMap() {
        return orderItemMap;
    }
}

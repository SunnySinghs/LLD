package Design.OrderManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductInventory {
    private List<Product> products;

    public ProductInventory() {
        this.products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(int id, String name, double price, int stockCount) {
        products.add(new Product(id, name, price, stockCount));
    }

    public void addStock(int productId, int count) {
        Product product = getProduct(productId);
        if (product != null) {
            product.addStock(count);
        }
    }

    public void removeStock(int productId, int count) {
        Product product = getProduct(productId);
        if (product != null) {
            product.removeStock(count);
        }
    }

    private Product getProduct(int productId){
        Optional<Product> product = products.stream().filter(p -> p.getId() == productId).findAny();
        if (product.isPresent()) {
            return product.get();
        }
        return null;
    }

}

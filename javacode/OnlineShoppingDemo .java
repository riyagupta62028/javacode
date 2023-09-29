import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private List<Product> items = new ArrayList<>();

    void addProduct(Product product) {
        items.add(product);
    }

    double calculateTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }
}

class CustomerOrder {
    private String customerName;
    private ShoppingCart cart;

    CustomerOrder(String customerName, ShoppingCart cart) {
        this.customerName = customerName;
        this.cart = cart;
    }

    void displayOrderDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Order Total: $" + cart.calculateTotal());
    }
}

public class OnlineShoppingDemo {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 999.99);
        Product phone = new Product("Phone", 499.99);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(laptop);
        cart.addProduct(phone);

        CustomerOrder order = new CustomerOrder("Alice", cart);
        order.displayOrderDetails();
    }
}

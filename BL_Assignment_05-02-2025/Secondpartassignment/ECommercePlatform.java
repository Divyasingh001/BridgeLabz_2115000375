import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}
class Order {
    private static int orderCounter = 1;
    private int orderId;
    private List<Product> products;
    private Customer customer;

    public Order(Customer customer) {
        this.orderId = orderCounter++;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId + " | Customer: " + customer.getName());
        System.out.println("Products:");
        double total = 0;
        for (Product p : products) {
            System.out.println("- " + p);
            total += p.getPrice();
        }
        System.out.println("Total Price: $" + total);
        System.out.println("-----------------------------");
    }
}
class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void showOrderHistory() {
        System.out.println(name + "'s Order History:");
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }
}
public class ECommercePlatform {
    public static void main(String[] args) {
   
        Product laptop = new Product("Laptop", 1000);
        Product phone = new Product("Smartphone", 700);
        Product headset = new Product("Headset", 150);

        Customer alice = new Customer("Alice");
        Customer bob = new Customer("Bob");

        Order order1 = new Order(alice);
        order1.addProduct(laptop);
        order1.addProduct(phone);
        alice.placeOrder(order1);

        Order order2 = new Order(bob);
        order2.addProduct(headset);
        bob.placeOrder(order2);

        Order order3 = new Order(alice);
        order3.addProduct(headset);
        order3.addProduct(phone);
        alice.placeOrder(order3);

        alice.showOrderHistory();
        bob.showOrderHistory();
    }
}

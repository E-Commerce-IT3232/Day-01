/*
 * implement classes for the given scenario:
 * - A reatail store which can store,edit,and delete
 * multible products like fruits, vegetables, grocery, etc..
 * - display the avilabe products like price, name,
 * quantity
 * 
 */

import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void displayProduct() {
        System.out.println("Product: " + name + ", Price: " + price + ", Quantity: " + quantity);
    }
}

class Fruit extends Product {
    public Fruit(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    // @Override
    public void displayProduct() {
        System.out.println("Fruit - " + getName() + ", Price: " + getPrice() + ", Quantity: " + getQuantity());
    }
}

class Vegetable extends Product {
    public Vegetable(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    // @Override
    public void displayProduct() {
        System.out.println("Vegetable - " + getName() + ", Price: " + getPrice() + ", Quantity: " + getQuantity());
    }
}

class Grocery extends Product {
    public Grocery(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public void displayProduct() {
        System.out.println("Grocery - " + getName() + ", Price: " + getPrice() + ", Quantity: " + getQuantity());
    }
}

class RetailStore {
    private List<Product> products;

    public RetailStore() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void editProduct(String name, String newName, double newPrice, int newQuantity) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                product.setName(newName);
                product.setPrice(newPrice);
                product.setQuantity(newQuantity);
                System.out.println("Product updated: " + product.getName());
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void deleteProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);
                System.out.println("Product deleted: " + name);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            System.out.println("Available Products:");
            for (Product product : products) {
                product.displayProduct();
            }
        }
    }
}

public class P7{
    public static void main(String[] args) {
        // Create RetailStore object
        RetailStore store = new RetailStore();

        // Add products to the store
        store.addProduct(new Fruit("Apple", 1.99, 100));
        store.addProduct(new Vegetable("Carrot", 0.99, 50));
        store.addProduct(new Grocery("Rice", 2.49, 200));

        // Display all products
        store.displayProducts();

        // Edit a product
        store.editProduct("Apple", "Green Apple", 2.49, 120);

        // Display products after editing
        System.out.println("\nAfter editing:");
        store.displayProducts();

        // Delete a product
        store.deleteProduct("Rice");

        // Display products after deletion
        System.out.println("\nAfter deleting Rice:");
        store.displayProducts();
    }
}
}
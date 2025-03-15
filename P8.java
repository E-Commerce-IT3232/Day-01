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

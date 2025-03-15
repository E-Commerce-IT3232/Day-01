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

}
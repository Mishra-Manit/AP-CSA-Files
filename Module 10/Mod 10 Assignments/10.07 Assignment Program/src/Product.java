/**
 * Purpose: Class to define a product in a store.
 *
 * @version 4/18/2022
 * @ Manit Mishra
 */

public class Product {
    private String name;
    private int productNumber;
    private double price;
    private int quantity;

    public Product (String name, int productNumber, double price, int quantity){
        this.name = name;
        this.productNumber = productNumber;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return String.format("Name: %-15s  Product Number: %-10s  Price: %-10s   Quantity: %-5s",name, productNumber,
                            price, quantity);
    }
}
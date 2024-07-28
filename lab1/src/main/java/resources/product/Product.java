package resources.product;

import resources.interfaces.ProductInterface;

public class Product implements ProductInterface{
    private String name;
    private double price;
    private int quantity;
    private int id;

    public Product(String name, double price, int quantity, int id){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void addQuantity(int quantity){
        this.quantity += quantity;
    }

    public void removeQuantity(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return "Name: " + name + ", Price: " + price + ", Quantity: " + quantity;
    }

    @Override
    public int getId() {
       return id;
    }
    
}

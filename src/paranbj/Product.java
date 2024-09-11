package paranbj;

import java.util.Scanner;
public class Product {
    private int id;
    private String name;
    private String category;
    private int stockQuantity;
    private double pricePerUnit;

    public Product(int id, String name, String category, int stockQuantity, double pricePerUnit) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.stockQuantity = stockQuantity;
        this.pricePerUnit = pricePerUnit;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
}
    


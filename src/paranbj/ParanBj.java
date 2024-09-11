package paranbj;

import java.util.Scanner;
import java.util.ArrayList;

public class ParanBj {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();

        System.out.print("Enter number of Products: ");
        int numProducts = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        for (int i = 0; i < numProducts; i++) {
            System.out.println("Enter details of product " + (i + 1) + ":");

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Category: ");
            String category = scanner.nextLine();

            System.out.print("Stock Quantity: ");
            int stockQuantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            System.out.print("Price per Unit: ");
            double pricePerUnit = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            Product product = new Product(id, name, category, stockQuantity, pricePerUnit);
            products.add(product);
        }

        System.out.println("\nID\tName\tCategory\tStock Quantity\tPrice per Unit\tStatus");

        for (Product product : products) {
            System.out.print(product.getId + "\t" + product.getName + "\t" + product.getCategory() + "\t" + product.getStockQuantity + "\t" + product.getPricePerUnit + "\t");

            if(product.isValid){
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}

/*
 class Product {
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

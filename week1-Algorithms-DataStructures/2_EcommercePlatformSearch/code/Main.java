package org.example;

import java.util.Scanner;


public class Main {

    static Product linearSearch(Product[] products, int productId) {
        for (Product product : products) {
            if (product.productId == productId) {
                return product;
            }
        }
        return null; // Product not found
    }

    static Product binarySearch(Product[] products, int productId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].productId == productId) {
                return products[mid];
            } else if (products[mid].productId < productId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // Product not found
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Smartphone", "Electronics"),
            new Product(3, "Tablet", "Electronics"),
            new Product(4, "Headphones", "Accessories"),
            new Product(5, "Smartwatch", "Wearables")
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product ID to search: ");
        int productId = scanner.nextInt();

        Product pLiner= linearSearch(products, productId);
        if (pLiner != null) {
            System.out.println("Linear Search: " + pLiner);
        } else {
            System.out.println("Linear Search: Product not found.");
        }

        Product pBinary = binarySearch(products, productId);
        if (pBinary != null) {
            System.out.println("Binary Search: " + pBinary);
        } else {
            System.out.println("Binary Search: Product not found.");
        }

    }
}
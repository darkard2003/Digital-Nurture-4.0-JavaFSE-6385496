package org.example;

public class Product {
    public int productId;
    public String productName;
    public String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{\n" +
                "productId=" + productId + '\n' +
                "productName=" + productName + '\n' +
                "category=" + category + '\n' +
                '}';
    }
}

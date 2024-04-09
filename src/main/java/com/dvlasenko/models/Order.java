package com.dvlasenko.models;

import com.dvlasenko.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Product> products;

    public Order() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product, int count) {
        for (int i = 0; i < count; i++) {
            products.add(product);
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Order Details:\n");
        stringBuilder.append("Products:\n");
        for (Product product : products) {
            stringBuilder.append(product.toString()).append("\n");
        }
        stringBuilder.append("Total Price: USD ").append(calculateTotal()).append("\n");
        return stringBuilder.toString();
    }
}
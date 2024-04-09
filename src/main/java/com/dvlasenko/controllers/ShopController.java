package com.dvlasenko.controllers;

import com.dvlasenko.builders.ProductBuilder;
import com.dvlasenko.entity.Product;
import com.dvlasenko.models.Order;

public class ShopController {
    public static void displayOrderDetails(Order order, String orderName) {
        System.out.println(orderName);
        System.out.println(order.toString());
        System.out.println();
    }

    public void shopProcessing() {
        ProductBuilder productBuilder = new ProductBuilder();
        Product redTShirt = productBuilder.setName("Red T-Shirt")
                .setPrice(20.0)
                .setColor("Red")
                .setBrand("Active sports")
                .setCategory("TShirt")
                .build();
        Product blueTShirt = productBuilder.setName("Blue T-Shirt")
                .setPrice(25.0)
                .setColor("Blue")
                .setBrand("Active sports")
                .setCategory("TShirt")
                .build();
        Product whiteCap = productBuilder.setName("White Cap")
                .setPrice(15.0)
                .setColor("White")
                .setBrand("Smart caps")
                .setCategory("Cap")
                .build();
        Product blackCap = productBuilder.setName("Black Cap")
                .setPrice(18.0)
                .setColor("Black")
                .setBrand("Smart caps")
                .setCategory("Cap")
                .build();

        Order orderA = new Order();
        orderA.addProduct(redTShirt, 1);
        orderA.addProduct(whiteCap, 1);

        Order orderB = new Order();
        orderB.addProduct(blueTShirt, 1);
        orderB.addProduct(blackCap, 1);

        displayOrderDetails(orderA, "Order A");
        displayOrderDetails(orderB, "Order B");
    }
}


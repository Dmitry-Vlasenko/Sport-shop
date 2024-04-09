package com.dvlasenko.builders;

import com.dvlasenko.entity.Product;

public class ProductBuilder {
    private String name;
    private double price;
    private String brand;
    private String category;
    private String color;

    public ProductBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public ProductBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public ProductBuilder setCategory(String category) {
        this.category = category;
        return this;
    }

    public ProductBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public Product build() {
        return new Product(name, price, color, brand, category);
    }
}
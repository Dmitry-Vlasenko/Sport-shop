package com.dvlasenko.entity;


public class Product {
    private String name;
    private double price;
    private String brand;
    private String category;
    private String color;

    public Product(String name, double price, String color, String brand, String category) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.brand = brand;
        this.category = category;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public String toString() {
        return String.format(
                "%-15s %s%n" + "%-15s %s%n" + "%-15s %s%n",
                "Name:", this.name,
                "Price:", this.price,
                "Brand:", this.brand
        );
    }
}
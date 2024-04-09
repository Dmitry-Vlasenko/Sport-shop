package com.dvlasenko;

import com.dvlasenko.controllers.ShopController;



public class Main {
    private final ShopController App = new ShopController();

    public void run() {
        App.shopProcessing();
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
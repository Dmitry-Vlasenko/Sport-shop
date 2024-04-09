package com.dvlasenko;
import com.dvlasenko.controllers.ShopMainController;



public class Main {
    private final ShopMainController App = new ShopMainController();

    public void run() {
        App.shopProcessing();
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
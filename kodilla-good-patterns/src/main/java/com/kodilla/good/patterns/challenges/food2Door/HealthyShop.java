package com.kodilla.good.patterns.challenges.food2Door;

public class HealthyShop extends Customer{

    public HealthyShop() {
        super("HealthyShop", "986UE", "Long Beach avenue 682D");
    }

    @Override
    public void orderProducts() {
        products.add(new Product("Olive oil", 2.00));
        products.add(new Product("Banana", 0.70));
        products.add(new Product("Potato", 3.50));
        products.add(new Product("Curry", 0.2));
        products.add(new Product("Garlic", 0.5));
    }
}

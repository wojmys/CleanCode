package com.kodilla.good.patterns.challenges.food2Door;

public class ExtraFoodShop extends Customer {

    public ExtraFoodShop() {
        super("ExtraFoodShop", "12234T", "XY street");
    }

    @Override
    public void orderProducts() {
        products.add(new Product("Tomato", 2.00));
        products.add(new Product("Egg", 0.80));
        products.add(new Product("Paprika", 1.50));
        products.add(new Product("Strawberry", 5.50));
    }


}

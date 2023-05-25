package com.kodilla.good.patterns.challenges.food2Door;

public class GlutenFreeShop extends Customer {

    public GlutenFreeShop() {
        super("GlutenFreeShop","1299234T","north street");
    }

    @Override
    public void orderProducts() {
        products.add(new Product("Red Wine",5.00));
        products.add(new Product("Egg", 0.80));
        products.add(new Product("Onion", 2.50));
        products.add(new Product("Strawberry",5.50));
        products.add(new Product("Tomato",2.00));
        products.add(new Product("Milk", 0.80));
        products.add(new Product("Apple", 1.50));
        products.add(new Product("Cucumber",6.50));
    }
}

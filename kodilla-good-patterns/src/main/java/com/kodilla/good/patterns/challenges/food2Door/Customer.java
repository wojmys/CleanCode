package com.kodilla.good.patterns.challenges.food2Door;

import java.util.HashSet;
import java.util.Set;

public abstract class Customer {
     String name;
     String id;
     String address;
     Set<Product> products= new HashSet<>();


    public Customer(String name, String id, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
        orderProducts();
    }

    public Set<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public abstract void orderProducts();

}

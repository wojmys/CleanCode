package com.kodilla.good.patterns.challenges.food2Door;

import java.util.Set;

public class OrderDto {

    private Customer customer;
    private Set<Product> orders;
    private boolean isOrdered;

    public OrderDto(Customer customer, Set<Product> orders, boolean isOrdered) {
        this.customer = customer;
        this.orders = orders;
        this.isOrdered = isOrdered;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Set<Product> getOrders() {
        return orders;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}

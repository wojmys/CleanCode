package com.kodilla.good.patterns.challenges.food2Door;


import java.util.HashSet;
import java.util.Set;

public class OrderProcessor {

    private InformationService informationService;
    private Customer customer;
    private Set<Product>orders;

    private boolean cartNotEmpty;


    public OrderProcessor(InformationService informationService, Customer customer) {
        this.informationService = informationService;
        this.customer = customer;
        orders=customer.getProducts();
        cartNotEmpty=true;
    }

    public OrderDto process() {
        if (cartNotEmpty) {
            informationService.sendInformation(customer, orders);
            return new OrderDto(customer, orders, true);
        } else {
            return new OrderDto(customer, orders, false);
        }
    }
}

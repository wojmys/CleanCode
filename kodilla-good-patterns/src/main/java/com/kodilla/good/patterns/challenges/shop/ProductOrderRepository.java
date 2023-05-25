package com.kodilla.good.patterns.challenges.shop;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {

    @Override
    public void createOrder(User user, LocalDateTime localDateTime) {
        System.out.println("Sending request to database...");
    }
}

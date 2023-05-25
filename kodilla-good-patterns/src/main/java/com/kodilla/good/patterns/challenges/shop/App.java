package com.kodilla.good.patterns.challenges.shop;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {

    User user = new User("John", "Smith");
    LocalDateTime ldt = LocalDateTime.now();
    Product product = new Product("coffee");

    OrderProcessor orderProcessor = new OrderProcessor(new EmailService(),new ProductOrderService(), new ProductOrderRepository());
    orderProcessor.process(user,ldt,product);
    }
}

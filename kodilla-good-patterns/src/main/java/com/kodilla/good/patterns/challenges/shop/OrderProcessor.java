package com.kodilla.good.patterns.challenges.shop;

import java.time.LocalDateTime;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;


    public OrderProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(User user, LocalDateTime dateAndTime,Product product) {
        boolean isOrdered = orderService.orderProduct(user,product);
        if (isOrdered) {
            informationService.sendMessage(user);
            orderRepository.createOrder(user, dateAndTime);
            return new OrderDto(user, true);
        } else {
            return new OrderDto(user, false);
        }
    }
}

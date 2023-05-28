package com.kodilla.good.patterns.challenges.food2Door;

public class App {
    public static void main(String[] args) {

        OrderProcessor orderProcessor = new OrderProcessor(new EmailService(),new ExtraFoodShop());
        orderProcessor.process();

        OrderProcessor orderProcessor1 = new OrderProcessor(new EmailService(),new GlutenFreeShop());
        orderProcessor1.process();

        OrderProcessor orderProcessor2 = new OrderProcessor(new EmailService(),new HealthyShop());
        orderProcessor2.process();

    }
}

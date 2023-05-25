package com.kodilla.good.patterns.challenges.shop;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProductOrderService implements OrderService {

        @Override
        public boolean orderProduct(User user, Product product) {

            DateTimeFormatter ldt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

            LocalDateTime localDateTime = LocalDateTime.now();
            String formattedTime = ldt.format(localDateTime);

            System.out.println("Ordering " +product.getName()+" for: "+user.getName()+" "+user.getSurname()+", on: "+ formattedTime);
            return true;
        }

}

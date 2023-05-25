package com.kodilla.good.patterns.challenges.food2Door;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Set;

public class EmailService implements InformationService {

    @Override
    public void sendInformation(Customer customer, Set<Product> orders) {

        DateTimeFormatter ldt = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String formattedTime = ldt.format(localDateTime);

        System.out.println("sending email to accounting department.."+"\n");
        System.out.println(customer.getName() + "\n" +
                customer.getAddress() + "\n" +
                customer.getId() + "\n" +
                        formattedTime+"\n"+
                "products ordered:" + "\n");
        Iterator itr = orders.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().toString());
        }
        System.out.println();
    }
}

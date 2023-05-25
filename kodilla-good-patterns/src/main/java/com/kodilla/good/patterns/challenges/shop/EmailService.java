package com.kodilla.good.patterns.challenges.shop;

public class EmailService implements InformationService {

    @Override
    public void sendMessage(User user) {
        System.out.println("Sending email to: "+user.getName()+" "+user.getSurname());
    }
}

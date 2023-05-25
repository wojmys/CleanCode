package com.kodilla.good.patterns.challenges.food2Door;

import java.util.Set;

public interface InformationService {
    void sendInformation(Customer customer, Set<Product> orders);

}

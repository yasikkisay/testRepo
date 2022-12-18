package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String message = "Hey boy!";
        System.out.println("Hello world! Good morning!");
        System.out.println(message);

        FeatureService featureService = new FeatureService();

        Customer customer1 = new Customer("Nike", "USA");
        featureService.assignFeatures(customer1);

        Customer customer2 = new Customer("Adidas", "Germany");
        featureService.assignFeatures(customer2);

        customer1.getFeatures().stream().forEach(f -> System.out.println(f.getName()));
        customer2.getFeatures().stream().forEach(f -> System.out.println(f.getName()));
    }
}

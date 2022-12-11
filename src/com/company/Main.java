package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String message = "Hey boy!";
        System.out.println("Hello world! Good morning!");
        System.out.println(message);

        List<String> items = new ArrayList<>();
        items.add("banana");
        items.add("bread");
        items.add("egg");

        Customer customer1 = new Customer("Nike", "USA");

        Map<String, Feature> features = new HashMap<>();
        features.put("calls", new Feature("Calls", "Ability to make calls", 1));
        features.put("sendSMS", new Feature("Send SMS", "Ability to send SMS", 1));
        features.put("receiveSMS", new Feature("Receive SMS", "Ability to receive SMS", 1));
        features.put("configureAnsweringRules", new Feature("Configure Answering rules", "Ability to configure answering rules", 2));
        features.put("necf", new Feature("New Emergency Calling Framework", "New flow for 911 calls", 2));
        features.put("readPresenceStatus", new Feature("Read presence status", "Read presence status", 2));

    }
}

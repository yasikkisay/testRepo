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

        Map<String, String> features = new HashMap<>();
        features.put("feature-1", "the first feature for feature branch");

        Feature f1 = new Feature("f1", "Test description of f1", 50);
    }
}

package com.company;

import java.util.ArrayList;
import java.util.List;

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
    }
}

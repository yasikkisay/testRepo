package com.company;

import java.util.*;

public class FeatureService {

    public FeatureService(){};

    private Feature calls = new Feature("Calls", "Ability to make calls", 1);
    private Feature sendSMS = new Feature("Send SMS", "Ability to send SMS", 1);
    private Feature receiveSMS = new Feature("Receive SMS", "Ability to receive SMS", 1);
    private Feature configureAnsweringRules = new Feature("Configure Answering rules", "Ability to configure answering rules", 2);
    private Feature necf = new Feature("New Emergency Calling Framework", "New flow for 911 calls", 2);
    private Feature readPresenceStatus = new Feature("Read presence status", "Read presence status", 2);

    public void assignFeatures(Customer customer) {
        Set<Feature> featureSet = new HashSet<Feature>();
        if (customer.getCountry() == "USA") {
            featureSet.addAll(Arrays.asList(
                    calls,
                    sendSMS,
                    receiveSMS,
                    configureAnsweringRules,
                    necf,
                    readPresenceStatus
            ));
        } else {
            featureSet.addAll(Arrays.asList(
                    calls,
                    configureAnsweringRules,
                    readPresenceStatus
            ));
        }
        customer.setFeatures(featureSet);
    }
}

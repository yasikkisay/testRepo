package com.company;

import java.util.List;
import java.util.Set;

public class Customer {

    public Customer() {
    }

    public Customer(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public Customer(String name, String country, Set<Feature> features) {
        this.name = name;
        this.country = country;
        this.features = features;
    }

    private String name;
    private String country;
    private Set<Feature> features;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Set<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(Set<Feature> features) {
        this.features = features;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

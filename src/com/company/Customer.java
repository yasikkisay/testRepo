package com.company;

public class Customer {

    public Customer() {
    }

    public Customer(String name, String country) {
        this.name = name;
        this.country = country;
    }

    private String name;
    private String country;

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

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

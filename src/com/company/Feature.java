package com.company;

public class Feature {
    public Feature() {
    }

    public Feature(String name, String description, Integer businessValue) {
        this.name = name;
        this.description = description;
        this.businessValue = businessValue;
    }

    private String name;
    private String description;
    private Integer businessValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getBusinessValue() {
        return businessValue;
    }

    public void setBusinessValue(Integer businessValue) {
        this.businessValue = businessValue;
    }

    @Override
    public String toString() {
        return "Feature{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", businessValue=" + businessValue +
                '}';
    }
}

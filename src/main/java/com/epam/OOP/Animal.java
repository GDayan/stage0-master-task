package com.epam.OOP;

public class Animal {
    // Private fields
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    // Constructor with full parameters
    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    // Method to return the description
    public String getDescription() {
        // Determine if we should use 'a' or 'no' for fur description
        String furDescription = hasFur ? "a" : "no";

        // Determine whether to use 'paw' or 'paws' based on numberOfPaws
        String pawWord = numberOfPaws == 1 ? "paw" : "paws";

        // Return the description
        return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + pawWord + " and " + furDescription + " fur.";
    }
}

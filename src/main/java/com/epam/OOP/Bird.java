package com.epam.OOP;

public class Bird extends Animal{
    // No-args constructor
    public Bird() {
        super("blue", 2, false); // Call the Animal constructor with Bird-specific values
    }

    // Override the getDescription method
    @Override
    public String getDescription() {
        // Get the original description from Animal class
        String baseDescription = super.getDescription();

        // Add additional Bird-specific sentence
        return baseDescription + " Moreover, it has 2 wings and can fly.";
    }
}

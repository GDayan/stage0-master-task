package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        long result = 1;

        // If power is negative, invert numberToPrint and power
        if (power < 0) {
            numberToPrint = -numberToPrint;
            power = -power;
        }

        // Calculate power using a for loop
        for (int i = 0; i < power; i++) {
            result *= numberToPrint;
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}

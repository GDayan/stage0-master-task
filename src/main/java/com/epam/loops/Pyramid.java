package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            // Print spaces to align the numbers properly
            for (int j = 0; j < cathetusLength - i; j++) {
                System.out.print(" ");
            }
            // Print numbers in ascending order
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Print numbers in descending order
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}

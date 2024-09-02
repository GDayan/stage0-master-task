package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {
        // Swap using bitwise XOR
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;

        System.out.println(first + " " + second);
    }

}

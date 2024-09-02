package com.epam.algorithms;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */

    public String[] seasonsArray() {return new String[]{"winter", "spring", "summer", "autumn"};
    }

    public int[] generateNumbers(int length) {
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }

    public int totalSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     *
     * @param arr the input array of integers.
     * @param number the number to find in the array.
     * @return the index of the first occurrence of number or -1 if not found.
     */
    public static int findIndexOfNumber(int[] arr, int number) {
        // Iterate through the array to find the first occurrence of the number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i; // Return the index if the number is found
            }
        }
        return -1; // Return -1 if the number is not found in the array
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     *
     * @param arr the input array containing strings.
     * @return a new array with the elements in reverse order.
     */
    public static String[] reverseArray(String[] arr) {
        // Create a new array to store the reversed elements
        String[] reversed = new String[arr.length];

        // Populate the reversed array by iterating through the input array from the end to the start
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }

        return reversed;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }

        // Step 2: Create a new array to store the positive numbers
        int[] positives = new int[count];
        int index = 0;

        // Step 3: Populate the new array with positive numbers from the input array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positives[index] = arr[i];
                index++;
            }
        }
        return positives;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            // Perform bubble sort for simplicity (since java.util.* cannot be used)
            for (int j = 0; j < arr[i].length - 1; j++) {
                for (int k = j + 1; k < arr[i].length; k++) {
                    if (arr[i][j] > arr[i][k]) {
                        // Swap elements to sort in ascending order
                        int temp = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = temp;
                    }
                }
            }
        }

        // Sort the arrays themselves based on their length in ascending order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].length > arr[j].length) {
                    // Swap the arrays to sort them based on their length
                    int[] temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

}
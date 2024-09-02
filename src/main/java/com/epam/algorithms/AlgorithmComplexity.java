package com.epam.algorithms;

import com.epam.algorithms.utils.Complexity;

/**
 * Tasks for assessing the algorithm complexity. The following are the ratios of the constants with the BigO estimate:
 * <p>
 * Complexity.O_LOG_N       -> O(log N) Complexity.O_N_2         -> O(log N^2) Complexity.O_FACTORIAL_N -> O(!N)
 * Complexity.O_2_N         -> O(2 * N) Complexity.O_N_LOG_N     -> O(N * log N) Complexity.O_1           -> O(1)
 * Complexity.O_N           -> O(N)
 */
public class AlgorithmComplexity {
    /**
     * Return the linear search complexity if the element you are looking for is at the end of the array.
     */
    public Complexity badLinerSearch() {
        // Linear search has a complexity of O(N) even if the element is at the end of the array.
        return Complexity.O_N;
    }

    /**
     * Return the complexity of accessing an array element by index.
     */
    public Complexity arrayIndexItemAccess() {
        // Accessing an element by index in an array is O(1).
        return Complexity.O_1;
    }

    /**
     * Return the complexity of a binary search.
     */
    public Complexity binarySorting() {
        // Binary search has a complexity of O(log N).
        return Complexity.O_LOG_N;
    }

    /**
     * Return the complexity of the twoCycleSorting algorithm.
     */
    public Complexity twoCycleSorting() {
        // Assuming Two Cycle Sorting has a complexity similar to bubble sort, which is O(N^2).
        return Complexity.O_N_2;
    }

}

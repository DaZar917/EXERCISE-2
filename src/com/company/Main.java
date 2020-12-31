package com.company;

import java.util.List;

import static com.company.DataConverter.*;

public class Main {
    public static void main(String[] args) {
        // Get the String input from standard input
        String numbers_input = scan();
        // String numbers_input = "6 1 3";

        // Converting and separating data from standard input
        int sum = separate_first_integer(numbers_input);
        List<Integer> unusable_values = separate_unusable_values(numbers_input);

        // counting ways with recursive brute force algorithm
        BruteForceAlgorithm bruteForceAlgorithm = new BruteForceAlgorithm(sum, unusable_values);
        bruteForceAlgorithm.count_ways();
    }
}

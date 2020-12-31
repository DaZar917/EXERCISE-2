package com.company;

import java.util.ArrayList;
import java.util.List;
import static com.company.DataConverter.separate_usable_values;

public class BruteForceAlgorithm {
    private final int sum;
    private final List<Integer> unusable_values;
    private int ways = 0;

    public BruteForceAlgorithm(int sum, List<Integer> unusable_values) {
        this.sum = sum;
        this.unusable_values = unusable_values;
    }

    public void count_ways(){
        List<Integer> usable_values = separate_usable_values(this.sum, this.unusable_values);
        int size = usable_values.size();
        initialization_brute(usable_values, size, this.sum);
        System.out.println("The algorithm find " + this.ways + " different ways.");
    }

    private void initialization_brute(List<Integer> numbers, int size, int brute_size) {
        List<Integer> chosen = new ArrayList<>();
        recursive_brute(chosen, numbers, 0, brute_size, 0, size - 1);
    }

    private void recursive_brute(List<Integer> chosen, List<Integer> numbers, int index, int brute_size, int start, int end) {
        int sum_of_line = 0;
        if (index == brute_size) {
            for (int i = 0; i < brute_size; i++) {
                if (numbers.get(chosen.get(i)) != 0)
                    System.out.printf("%d ", numbers.get(chosen.get(i)));
                sum_of_line = sum_of_line + numbers.get(chosen.get(i));
            }
            if (sum_of_line == this.sum){
                System.out.print(" - the new way");
                ways++;
            }
            System.out.println();
            return;
        }
        for (int i = start; i <= end; i++) {
            chosen.add(index,i);
            recursive_brute(chosen, numbers, index + 1, brute_size, i, end);
        }
    }
}

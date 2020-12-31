package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataConverter {
    public static String scan(){
        Scanner keyboard = new Scanner(System.in);
        String numbers;
        System.out.print("Type your input: ");
        numbers = keyboard.nextLine();
        while(true) {
            try {
                convert_data(numbers);
                break;

            } catch (NumberFormatException exception) {
                System.out.println("Invalid input! Please try again!");
                System.out.print("Type your input: ");
                numbers = keyboard.nextLine();
            }
        }
        return numbers;
    }

    public static List<Integer> convert_data(String data){
        String[] integerStrings = data.split(" ");
        List<Integer> integers = new ArrayList<>();
        for (String integerString : integerStrings) {
            integers.add(Integer.parseInt(integerString));
        }
        return integers;
    }

    public static int separate_first_integer(String data){
        List<Integer> integers = convert_data(data);
        System.out.println("Sum of the product is: " + integers.get(0));
        return integers.get(0);
    }

    public static List<Integer> separate_unusable_values(String data){
        List<Integer> integers = convert_data(data);
        integers.remove(0);
        System.out.println("You can't use these values: " + integers);
        return integers;
    }

    public static List<Integer> separate_usable_values(int sum, List<Integer> unusable_values){
        List<Integer> usable_values = new ArrayList<>();
        for (int i = 0; i < sum; i++){
            if (!unusable_values.contains(i)) {
                usable_values.add(i);
            }
        }
        return usable_values;
    }
}
